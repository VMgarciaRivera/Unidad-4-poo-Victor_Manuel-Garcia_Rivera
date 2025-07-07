package Taller12.Ejemplos.UsoIncorrecto;

//Interfaz Corredor
interface Corredor {
    void correr();
}
// Clase incorrecta que implementa la interfaz pero no tiene lógica relacionada
public class Arbol implements Corredor {
    @Override
    public void correr() {
        // El árbol no tiene una lógica para correr, lo cual no tiene sentido
        System.out.println("Los árboles no pueden correr.");
    }
}

//Explicación: Aunque el código compila, implementar una interfaz que no tiene sentido para la clase arbol es una mala práctica. Las clases deben
// implementar interfaces solo cuando la lógica de la clase está alineada con los métodos definidos en la interfaz