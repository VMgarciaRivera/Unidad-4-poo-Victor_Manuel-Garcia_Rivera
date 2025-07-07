package Taller11.Ejercicios.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente(5000, 1000);
        Empleado vendedor = new Vendedor(3000, 500);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}
