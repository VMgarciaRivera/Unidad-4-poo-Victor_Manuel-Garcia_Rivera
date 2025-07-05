package Taller3.Ejemplos.EjemplosDeUsoIncorrecto;

//Ejemplo Incorrecto 1: Intentar Acceder a Atributos No Estáticos desde un Método static

public class Persona {
    private String nombre;
    public static void mostrarNombre() {
        //System.out.println("Nombre: " + nombre); <--- no se puede acceder a nombre
        // Error de compilación: No se puede acceder a 'nombre' desde un contexto estático
    }
}
