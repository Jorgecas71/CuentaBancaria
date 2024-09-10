package dev.jorge;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(15000, 0.05f);
        cuentaAhorros.consignar(5000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.extractoMensual();
        
    }

    public int dividir(int i, int j) {
        throw new UnsupportedOperationException("Unimplemented method 'dividir'");
    }

    public int multiplicar(int i, int j) {
        throw new UnsupportedOperationException("Unimplemented method 'multiplicar'");
    }

    public int restar(int i, int j) {
        throw new UnsupportedOperationException("Unimplemented method 'restar'");
    }

    public int sumar(int i, int j) {
        throw new UnsupportedOperationException("Unimplemented method 'sumar'");
    }
}