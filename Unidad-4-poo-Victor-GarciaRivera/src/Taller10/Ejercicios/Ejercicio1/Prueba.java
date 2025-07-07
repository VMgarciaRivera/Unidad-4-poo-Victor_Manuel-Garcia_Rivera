package Taller10.Ejercicios.Ejercicio1;

public class Prueba {
    public static void main (String[] args){
        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();

        // Polimorfismo
        System.out.println("\nPolimorfismo:");
        Persona p1 = new Estudiante();
        Persona p2 = new Profesor();

        p1.presentarse();
        p2.presentarse();
    }
}
