package Taller6.Ejemplos.UsoIncorrecto;

public class Usuario {
    protected String contraseña; // No debería ser `protected`

    public Usuario(String contraseña) {
        this.contraseña = contraseña;
    }
}
