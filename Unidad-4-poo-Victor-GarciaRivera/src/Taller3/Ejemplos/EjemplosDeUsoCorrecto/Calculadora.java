package Taller3.Ejemplos.EjemplosDeUsoCorrecto;

public class Calculadora {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public class Main {
        public static void main(String[] args) {
            int resultado = Calculadora.sumar(5, 7); // Llama al método estático sin crear una instancia
            System.out.println("Resultado: " + resultado); // Muestra: Resultado: 12
        }
    }
}