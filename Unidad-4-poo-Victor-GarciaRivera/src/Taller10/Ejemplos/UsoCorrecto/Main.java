package Taller10.Ejemplos.UsoCorrecto;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Empleado gerente = new Gerente(); // Polimorfismo
        empleado.trabajar(); // Muestra: El empleado está trabajando.
        gerente.trabajar(); // Muestra: El gerente está gestionando el equipo.
    }
}

// Explicación: La referencia gerente de tipo Empleado invoca el método
//  sobrescrito en Gerente gracias al polimorfismo.
