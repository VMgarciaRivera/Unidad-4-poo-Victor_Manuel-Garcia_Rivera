package Taller15.Ejemplos.SistemasDeNotificaciones;

// Clase SMSService (responsable de las notificaciones por SMS)
public class SMSService {
    public void enviarSMS(String numero, String mensaje) {
        System.out.println("Enviando SMS a: " + numero);
        System.out.println("Mensaje: " + mensaje);
    }
}
