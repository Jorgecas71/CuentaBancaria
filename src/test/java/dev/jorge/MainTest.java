package dev.jorge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
class MainTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testMain() {
        String[] args = {};
        Main.main(args);
        
       
    }

    @Test
    void testSumar() {
        Main main = new Main();
        int resultado = main.sumar(2, 3);
        assertEquals(5, resultado, "La suma de 2 y 3 debería ser 5");
    }

    @Test
    void testRestar() {
        Main main = new Main();
        int resultado = main.restar(5, 3);
        assertEquals(2, resultado, "La resta de 5 y 3 debería ser 2");
    }

    @Test
    void testMultiplicar() {
        Main main = new Main();
        int resultado = main.multiplicar(2, 3);
        assertEquals(6, resultado, "La multiplicación de 2 y 3 debería ser 6");
    }

    @Test
    void testDividir() {
        Main main = new Main();
        int resultado = main.dividir(6, 3);
        assertEquals(2, resultado, "La división de 6 entre 3 debería ser 2");
    }
}
