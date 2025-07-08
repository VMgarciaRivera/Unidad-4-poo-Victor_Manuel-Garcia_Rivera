package Taller15.Ejercicios.Ejercicio2;

public class Producto {
    private String nombre;
    private double precioBase;
    private double impuesto;

    public Producto(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public void generarEtiqueta() {
        System.out.println("ETIQUETA:");
        System.out.println("Producto: " + nombre);
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }

    public double calcularPrecioFinal() {
        return precioBase + (precioBase * impuesto);
    }

    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando producto '" + nombre + "' en la base de datos...");
    }
}
//PROBLEMA:
//Tiene 3 responsabilidades diferentes:
//
//Datos del producto
//
//Cálculo de precios
//
//Generación de etiquetas
//
//Persistencia en base de datos
