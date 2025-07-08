package Taller14.Ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();         // Referencia y objeto de tipo Persona
        Persona estudiante = new Estudiante();   // Referencia de tipo Persona, objeto Estudiante
        Persona profesor = new Profesor();       // Referencia de tipo Persona, objeto Profesor

        persona.presentarse();     // Salida: Hola, soy una persona.
        estudiante.presentarse();  // Salida: Hola, soy un estudiante.
        profesor.presentarse();    // Salida: Hola, soy un profesor.
    }
}
