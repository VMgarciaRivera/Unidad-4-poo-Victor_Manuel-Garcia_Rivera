package Taller7.Ejemplos.UsoIncorrecto;

class Persona {
    public String nombre;
    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan"); // Error de compilación: Persona no es visible
    }
}