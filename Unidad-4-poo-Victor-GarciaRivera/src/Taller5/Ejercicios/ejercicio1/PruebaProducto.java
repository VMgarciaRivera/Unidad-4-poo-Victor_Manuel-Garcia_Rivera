package Taller5.Ejercicios.ejercicio1;

class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 2499.99, 15);

        System.out.println("Accediendo directamente:");
        System.out.println("Nombre: " + p1.nombre);
        System.out.println("Precio: $" + p1.precio);
        System.out.println("Stock: " + p1.stock + " unidades");

        System.out.println("\nmostrarInfo():");
        p1.mostrarInfo();
    }
}


