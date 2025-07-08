package Taller15.Ejercicios.Ejercicio2.RefactorizacionAplicandoSRP;

public class EtiquetaProducto {
    public void generarEtiqueta(Producto producto, double precioFinal) {
        System.out.println("ETIQUETA:");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio final: $" + precioFinal);
    }
}
