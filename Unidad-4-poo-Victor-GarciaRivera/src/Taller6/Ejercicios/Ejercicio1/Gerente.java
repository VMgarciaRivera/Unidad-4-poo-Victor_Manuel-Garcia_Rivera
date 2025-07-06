package Taller6.Ejercicios.Ejercicio1;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    // Sobrescribimos el método para mostrar información del gerente
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llamamos a la versión de Empleado
        System.out.println("Departamento: " + departamento);
    }
}

