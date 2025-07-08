package Taller15.Ejercicios.Ejercicio3;

public class Usuario {
    private String nombreUsuario;
    private String contraseña;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean validarFormato() {
        return nombreUsuario != null && contraseña.length() >= 6;
    }

    public boolean autenticar(String nombreIngresado, String claveIngresada) {
        return nombreUsuario.equals(nombreIngresado) && contraseña.equals(claveIngresada);
    }
}

//Problemas:
//Usuario mezcla:
//
//Datos del usuario.
//
//Validación de formato.
//
//Autenticación (lógica de negocio).