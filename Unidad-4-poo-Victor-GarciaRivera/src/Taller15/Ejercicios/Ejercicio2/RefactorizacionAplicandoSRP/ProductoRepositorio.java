package Taller15.Ejercicios.Ejercicio2.RefactorizacionAplicandoSRP;

public class ProductoRepositorio {
    public void guardar(Producto producto) {
        System.out.println("Guardando producto '" + producto.getNombre() + "' en la base de datos...");
    }
}
