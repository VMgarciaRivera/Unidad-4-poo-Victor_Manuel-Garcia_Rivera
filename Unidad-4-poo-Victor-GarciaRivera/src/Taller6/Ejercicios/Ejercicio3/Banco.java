package Taller6.Ejercicios.Ejercicio3;

public class Banco {
    protected double saldo;  // MAL USO: acceso protegido a un dato sensible

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}

//solucion

/*
* public class BancoSeguro {
    private double saldo;  //  Dato crítico encapsulado correctamente

    public BancoSeguro(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            throw new IllegalArgumentException("Saldo inicial no puede ser negativo.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("Error: El monto debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Error: Fondos insuficientes o monto inválido.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo disponible: $" + saldo);
    }
}

* */

