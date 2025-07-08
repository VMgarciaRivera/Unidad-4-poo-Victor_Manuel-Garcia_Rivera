package Taller13.Ejemplos.UsoCorrecto;

// Clase abstracta
abstract class Figura {
    public abstract double calcularArea(); // Método abstracto

    public void mostrarFigura() {
        System.out.println("Mostrando figura.");
    }
}

// Clase derivada
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}