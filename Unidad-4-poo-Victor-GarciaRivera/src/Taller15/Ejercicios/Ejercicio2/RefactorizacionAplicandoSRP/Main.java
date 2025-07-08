package Taller15.Ejercicios.Ejercicio2.RefactorizacionAplicandoSRP;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000.00, 0.15);

        CalculadoraPrecio calculadora = new CalculadoraPrecio();
        double precioFinal = calculadora.calcularPrecioFinal(producto);

        EtiquetaProducto etiqueta = new EtiquetaProducto();
        etiqueta.generarEtiqueta(producto, precioFinal);

        ProductoRepositorio repo = new ProductoRepositorio();
        repo.guardar(producto);
    }
}
