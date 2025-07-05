package Taller2.Ejemplos.this_para_Diferenciar_Atributos_y_Parámetros;

public class Persona {
    private String nombre;
    public Persona(String nombre) {
        this.nombre = nombre; // Usamos `this` para referirnos al atributo de la clase
    }
    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre); // Usamos `this` para referirnos al atributo
    }
}
