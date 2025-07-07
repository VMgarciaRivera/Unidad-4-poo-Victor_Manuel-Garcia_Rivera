package Taller11.Ejercicios.Ejercicio3;

abstract class Figura {
    public abstract double calcularArea();
}

public class AbstractaDirecta {
    public static void main(String[] args) {
        //Figura figura = new Figura(); // ❌ Error de compilación
    }
}

//error Figura is abstract; cannot be instantiated