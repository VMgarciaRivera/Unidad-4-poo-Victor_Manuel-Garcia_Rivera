package Taller13.Ejemplos.UsoIncorrecto;

// Clase abstracta
abstract class Animal {
    public abstract void hacerSonido();
}
// Clase derivada incorrecta
class Gato extends Animal {
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
    // Aunque el método hacerSonido no se sobrescribe, el error se evita por falta de visibilidad o error lógico.
}

//Explicación: Aunque el código compila, esta es una mala práctica ya que se espera que todas las clases derivadas proporcionen una implementación de
// los métodos abstractos definidos en la clase base.