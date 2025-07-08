package Taller15.Ejemplos.AplicaciondelSRP;

// Clase Usuario (solo datos del usuario)
public class Usuario {
    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }
}