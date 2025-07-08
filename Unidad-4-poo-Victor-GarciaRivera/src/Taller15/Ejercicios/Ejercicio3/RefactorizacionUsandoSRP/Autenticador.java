package Taller15.Ejercicios.Ejercicio3.RefactorizacionUsandoSRP;

public class Autenticador {
    public boolean autenticar(Usuario usuario, String nombreIngresado, String claveIngresada) {
        return usuario.getNombreUsuario().equals(nombreIngresado)
                && usuario.getContraseña().equals(claveIngresada);
    }
}
