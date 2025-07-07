package Taller7.Ejemplos.UsoIncorrecto;

// Ejemplo Incorrecto 2: Exposición Pública de Atributos Sensibles

public class CuentaBancaria {
    public double saldo;
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
}

//Explicación: Aunque el código compila, es una mala práctica exponer atributos sensibles como public, ya que permite un acceso descontrolado y
// compromete la seguridad de los datos
