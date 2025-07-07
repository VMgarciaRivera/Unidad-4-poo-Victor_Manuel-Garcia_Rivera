package Taller9.Ejercicios.Ejercicio1;

public class Empleado extends Persona{
    public String departamento;

    public Empleado(String nombre, int edad, String departamento){
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}
