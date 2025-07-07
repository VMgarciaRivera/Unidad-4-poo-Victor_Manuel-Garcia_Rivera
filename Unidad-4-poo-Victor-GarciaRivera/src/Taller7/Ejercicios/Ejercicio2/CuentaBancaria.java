package Taller7.Ejercicios.Ejercicio2;

class Cuenta {
    private int NumeroCuenta;
    private double saldo;
    public String tipocuenta;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void detallesCuenta(){
        System.out.println("Numero de Cuenta: " + NumeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de Cuenta: " + tipocuenta);
    }


}

public class CuentaBancaria{
    public static void main(String[] args) {
        Cuenta newcuenta = new Cuenta();

        //newcuenta.NumeroCuenta = 12345678;
    }
}

//errores de compilacion: java: NumeroCuenta has private access in Taller7.Ejercicios.Ejercicio2.Cuenta
