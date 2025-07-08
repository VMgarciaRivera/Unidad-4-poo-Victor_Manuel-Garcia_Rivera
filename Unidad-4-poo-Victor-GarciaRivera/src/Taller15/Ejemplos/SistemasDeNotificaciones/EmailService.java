package Taller15.Ejemplos.SistemasDeNotificaciones;

// Clase EmailService (responsable de las notificaciones por correo)
public class EmailService {
    public void enviarEmail(String destinatario, String mensaje) {
        System.out.println("Enviando email a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}