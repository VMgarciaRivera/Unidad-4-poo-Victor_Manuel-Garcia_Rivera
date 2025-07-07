package Taller12.Ejercicios.Ejercicio1;

public class Ave implements Volador, Cantante {

    @Override
    public void volar() {
        System.out.println("El ave está volando alto en el cielo.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave canta una melodía alegre.");
    }
}

