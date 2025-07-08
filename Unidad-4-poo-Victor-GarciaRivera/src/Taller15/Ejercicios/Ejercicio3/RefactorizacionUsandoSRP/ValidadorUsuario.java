package Taller15.Ejercicios.Ejercicio3.RefactorizacionUsandoSRP;

public class ValidadorUsuario {
    public boolean validar(Usuario usuario) {
        if (usuario.getNombreUsuario() == null || usuario.getNombreUsuario().isEmpty()) {
            return false;
        }

        return usuario.getContraseña() != null && usuario.getContraseña().length() >= 6;
    }
}

