package Taller15.Ejercicios.Ejercicio2.RefactorizacionAplicandoSRP;

public class CalculadoraPrecio {
    public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() * (1 + producto.getImpuesto());
    }
}

