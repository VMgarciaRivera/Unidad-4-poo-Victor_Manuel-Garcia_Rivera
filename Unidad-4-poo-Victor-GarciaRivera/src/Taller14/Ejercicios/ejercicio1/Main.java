package Taller14.Ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(3.0);         // Referencia de tipo Figura
        Figura figura2 = new Rectangulo(4.0, 5.0); // Referencia de tipo Figura

        figura1.calcularArea(); // Llama al método sobrescrito en Circulo
        figura2.calcularArea(); // Llama al método sobrescrito en Rectangulo
    }
}

