package Taller12.Ejemplos.UsoCorrecto;

// Interfaz Volador
interface Volador {
    void volar();
}
// Interfaz Nadador

interface Nadador {
    void nadar();
}
// Clase Pato que implementa ambas interfaces
class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato está volando.");
    }
    @Override
    public void nadar() {
        System.out.println("El pato está nadando.");
    }
}
// Clase de prueba
public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.volar();
        pato.nadar();
    }
}

// Explicación:La clase Pato implementa dos interfaces(VoladoryNadador).Esto permite
// que Pato tenga dos comportamientos diferentes :volar y nadar