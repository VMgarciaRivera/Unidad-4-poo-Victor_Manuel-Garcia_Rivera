package Taller13.Ejercicios.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(10, 5);
        Figura triangulo = new Triangulo(8, 4);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
