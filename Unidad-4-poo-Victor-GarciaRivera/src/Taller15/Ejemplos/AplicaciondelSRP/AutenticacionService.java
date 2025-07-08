package Taller15.Ejemplos.AplicaciondelSRP;

// Clase AutenticacionService (responsable de la autenticación)
public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String contrasena) {
        return usuario.getNombre().equals("admin") && contrasena.equals("1234");
    }
}