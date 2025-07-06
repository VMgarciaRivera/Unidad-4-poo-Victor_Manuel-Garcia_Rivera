package Taller4.Ejemplos.UsoIncorrecto;

//Ejemplo Incorrecto 2: No usar métodos get y set para controlar el acces

public class Producto {
    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        // No se realiza ninguna validación aquí
        precio = nuevoPrecio;
    }
}
