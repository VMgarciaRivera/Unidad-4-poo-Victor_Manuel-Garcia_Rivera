package Taller8.Ejercicios.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear objeto Empleado
        Empleado emp1 = new Empleado("Laura", 3000.0);
        System.out.println("Detalles del empleado:");
        emp1.mostrarDetalles();

        System.out.println();

        // Crear objeto Gerente
        Gerente gerente1 = new Gerente("Carlos", 5000.0, "Finanzas");
        System.out.println("Detalles del gerente:");
        gerente1.mostrarDetalles();
    }
}
