package Taller10.Ejemplos.UsoCorrecto;

// Clase base
class Empleado {
    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }
}
// Clase derivada
class Gerente extends Empleado {
    @Override
    public void trabajar() {
        System.out.println("El gerente está gestionando el equipo.");
    }
}