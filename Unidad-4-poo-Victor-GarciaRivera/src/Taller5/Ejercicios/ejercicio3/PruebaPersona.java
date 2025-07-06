package Taller5.Ejercicios.ejercicio3;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Ana", 30);

        System.out.println("Edad: " + p.edad);

        // Acceso al atributo nombre (private) -> no permitido directamente
        // System.out.println(p.nombre);  // Esto generaría error de compilación

        // Uso correcto
        System.out.println("Nombre: " + p.getNombre());

        p.setNombre("Ana María");
        System.out.println("Nuevo nombre: " + p.getNombre());
    }
}

