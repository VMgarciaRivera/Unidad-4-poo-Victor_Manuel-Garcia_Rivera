package Taller3.Ejercicios.Ejercicio2;

public class Main {
    public static void main(String[] args){
        double a = 2;
        double b = 10;

        System.out.println(a + " + " + b + " = " + Matematicas.suma(a,b));
        System.out.println(a + " - " + b + " = " + Matematicas.resta(a,b));
        System.out.println(a + " * " + b + " = " + Matematicas.multiplicacion(a,b));
        System.out.println(a + " / " + b + " = " + Matematicas.division(a,b));
    }
}
