package Taller7.Ejercicios.Ejercicio3;

public class Utilidades {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: división por cero.");
            return Double.NaN; // No es un numero
        }
        return a / b;
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double c = 0;

        System.out.println("Suma: " + Utilidades.sumar(a, b));
        System.out.println("Resta: " + Utilidades.restar(a, b));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(a, b));
        System.out.println("División: " + Utilidades.dividir(a, b));

        // Prueba de división por cero
        System.out.println("División por cero: " + Utilidades.dividir(a, c)); // Error
    }
}
