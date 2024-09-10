package dev.jorge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaAhorrosTest {
    private CuentaAhorros cuentaAhorros;

    @BeforeEach
    public void setUp() {
        cuentaAhorros = new CuentaAhorros(10000, 12); 
    }

    @Test
    public void testConsignarCuentaActiva() {
        cuentaAhorros.consignar(500);
        assertEquals(10500, cuentaAhorros.saldo);
        assertEquals(1, cuentaAhorros.numConsignaciones);
    }

    @Test
    public void testConsignarCuentaInactiva() {
        cuentaAhorros = new CuentaAhorros(5000, 12); 
        cuentaAhorros.consignar(500);
        assertEquals(5000, cuentaAhorros.saldo); 
        assertEquals(0, cuentaAhorros.numConsignaciones); 
    }

    @Test
    public void testRetirarCuentaActiva() {
        cuentaAhorros.retirar(500);
        assertEquals(9500, cuentaAhorros.saldo);
        assertEquals(1, cuentaAhorros.numRetiros);
    }

    @Test
    public void testRetirarCuentaInactiva() {
        cuentaAhorros = new CuentaAhorros(5000, 12); 
        assertEquals(5000, cuentaAhorros.saldo); 
        assertEquals(0, cuentaAhorros.numRetiros); 
    }

    @Test
    public void testExtractoMensualConMasDeCuatroRetiros() {
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(1000); 
        cuentaAhorros.extractoMensual();
        assertEquals(5000 - 1000, cuentaAhorros.saldo, 4000); 
    }

    @Test
    public void testImprimir() {
        cuentaAhorros.imprimir();
        
    }
}
