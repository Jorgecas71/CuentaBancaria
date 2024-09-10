package dev.jorge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
    private CuentaCorriente cuentaCorriente;

    @BeforeEach
    public void setUp() {
        cuentaCorriente = new CuentaCorriente(1000, 12); 
    }

    @Test
    public void testConsignarSinSobregiro() {
        cuentaCorriente.consignar(500);
        assertEquals(1500, cuentaCorriente.saldo);
        assertEquals(1, cuentaCorriente.numConsignaciones);
        assertEquals(0, cuentaCorriente.getSobregiro());
    }

    @Test
    public void testConsignarConSobregiro() {
        cuentaCorriente.retirar(1500); 
        cuentaCorriente.consignar(300);
        assertEquals(0, cuentaCorriente.saldo);
        assertEquals(200, cuentaCorriente.getSobregiro());
    }

    @Test
    public void testConsignarParaCubrirSobregiro() {
        cuentaCorriente.retirar(1500); 
        cuentaCorriente.consignar(600);
        assertEquals(100, cuentaCorriente.saldo);
        assertEquals(0, cuentaCorriente.getSobregiro());
    }

    @Test
    public void testRetirarConSaldoSuficiente() {
        cuentaCorriente.retirar(500);
        assertEquals(500, cuentaCorriente.saldo);
        assertEquals(1, cuentaCorriente.numRetiros);
        assertEquals(0, cuentaCorriente.getSobregiro());
    }

    @Test
    public void testRetirarConSaldoInsuficiente() {
        cuentaCorriente.retirar(1500);
        assertEquals(0, cuentaCorriente.saldo);
        assertEquals(1, cuentaCorriente.numRetiros);
        assertEquals(500, cuentaCorriente.getSobregiro());
    }

    @Test
    public void testImprimir() {
        cuentaCorriente.retirar(1500); 
        cuentaCorriente.imprimir();
        
    }
}
