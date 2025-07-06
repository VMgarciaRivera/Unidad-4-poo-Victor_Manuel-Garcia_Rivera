package Taller4.Ejemplos.UsoIncorrecto;

//Ejemplo Incorrecto 1: Intentar acceder a un miembro privado desde otra clase
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
/*
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        System.out.println(p.nombre); // Error de compilación: nombre tiene acceso privado
    }
}*/