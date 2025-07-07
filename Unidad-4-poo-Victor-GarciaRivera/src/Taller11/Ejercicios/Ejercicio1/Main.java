package Taller11.Ejercicios.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 3.0);

        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}
