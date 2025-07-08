package Taller15.Ejemplos.ViolacionesDelSRP;

// Violación:La clase Empleado tiene métodos para la gestión de su información personal
// ,cálculo de salario y generación de informes.

class Empleado {
    private String nombre;
    private double salario;
    public double calcularSalarioMensual() {
        return salario * 12;
    }
    public void generarInforme() {
        System.out.println("Generando informe para: " + nombre);
    }
    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando empleado en la base de datos...");
    }
}

// Problema:La clase Empleado tiene tres responsabilidades diferentes:
// cálculos, generación de informes y persistencia.