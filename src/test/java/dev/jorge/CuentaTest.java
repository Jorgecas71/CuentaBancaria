package dev.jorge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTest {
    private Cuenta cuenta;

    @BeforeEach
    public void setUp() {
        cuenta = new Cuenta(1000, 12); 
    }

    @Test
    public void testConsignar() {
        cuenta.consignar(500);
        assertEquals(1500, cuenta.saldo);
        assertEquals(1, cuenta.numConsignaciones);
    }

    @Test
    public void testRetirarConSaldoSuficiente() {
        cuenta.retirar(500);
        assertEquals(500, cuenta.saldo);
        assertEquals(1, cuenta.numRetiros);
    }

    @Test
    public void testRetirarConSaldoInsuficiente() {
        cuenta.retirar(1500);
        assertEquals(1000, cuenta.saldo); 
        assertEquals(0, cuenta.numRetiros); 
    }

    @Test
    public void testCalcularInteresMensual() {
        cuenta.calcularInteresMensual();
        assertEquals(1010, cuenta.saldo, 0.01); 
    }

    @Test
    public void testExtractoMensual() {
        cuenta.comisionMensual = 50;
        cuenta.extractoMensual();
        assertEquals(959.5, cuenta.saldo, 0.01); 
    }
}
