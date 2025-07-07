package Taller12.Ejemplos.UsoCorrecto;

// Interfaz Caminador
interface Caminador {
    void caminar();
}

// Interfaz Hablador
interface Hablador {
    void hablar();
}

// Clase Robot que implementa ambas interfaces
public class Robot implements Caminador, Hablador {
    @Override
    public void caminar() {
        System.out.println("El robot está caminando.");
    }

    @Override
    public void hablar() {
        System.out.println("El robot está hablando.");
    }
}

//Explicación:La clase Robot implementa dos interfaces(CaminadoryHablador).
// Esto permite que Robot tenga dos comportamientos independientes:
// caminaryhablar.