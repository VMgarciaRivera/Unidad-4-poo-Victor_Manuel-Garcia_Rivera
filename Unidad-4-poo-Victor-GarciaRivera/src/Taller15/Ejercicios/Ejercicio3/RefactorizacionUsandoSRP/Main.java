package Taller15.Ejercicios.Ejercicio3.RefactorizacionUsandoSRP;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("juan123", "claveSegura");

        ValidadorUsuario validador = new ValidadorUsuario();
        Autenticador autenticador = new Autenticador();

        if (!validador.validar(usuario)) {
            System.out.println("Datos inválidos del usuario.");
            return;
        }

        boolean acceso = autenticador.autenticar(usuario, "juan123", "claveSegura");

        if (acceso) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}
