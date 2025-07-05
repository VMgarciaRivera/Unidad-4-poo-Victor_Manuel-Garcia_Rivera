package Taller2.Ejercicios.ejercicio1;

public class Producto {
    private String nombre;
    private double precio;

    public void Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
    }
}
