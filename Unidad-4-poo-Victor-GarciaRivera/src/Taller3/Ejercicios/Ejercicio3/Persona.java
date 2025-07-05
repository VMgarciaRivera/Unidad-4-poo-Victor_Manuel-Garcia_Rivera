package Taller3.Ejercicios.Ejercicio3;

public class Persona {

    // Atributo NO estático (pertenece a cada objeto de la clase)
    public String nombre;

    // Método estático (pertenece a la clase, NO a un objeto)
    public static void cambiarNombre(String nuevoNombre) {
        // Aquí estamos intentando acceder directamente al atributo no estático 'nombre'
        // Esto generará un error de compilación:
        // nombre = nuevoNombre;

        // El método 'cambiarNombre' es estático, por lo que pertenece a la clase 'Persona'
        // no a una instancia específica. Pero 'nombre' es un atributo de instancia,
        // y para acceder a él se debe tener un objeto específico de la clase.

        //Solución: crear una instancia de la clase para acceder al atributo
        Persona p = new Persona(); // Creamos una instancia
        p.nombre = nuevoNombre;    // Ahora sí podemos modificar el atributo
    }

    public static void main(String[] args) {
        cambiarNombre("Carlos");
    }
}
