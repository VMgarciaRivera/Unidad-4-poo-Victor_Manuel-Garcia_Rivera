package Taller7.Ejercicios.Ejercicio1;

public class Empleado {
    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: el salario no puede ser negativo.");
        }
    }

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Ana", 3000);

        System.out.println("Empleado 1: " + emp1.nombre);
        System.out.println("Salario: " + emp1.getSalario());

        emp1.setSalario(3500);
        System.out.println("Nuevo salario: " + emp1.getSalario());

        // Probar con salario negativo
        emp1.setSalario(-500);

        // Cambiar y mostrar nombre directamente
        emp1.nombre = "Ana María";
        System.out.println("Nombre actualizado: " + emp1.nombre);
    }
}

