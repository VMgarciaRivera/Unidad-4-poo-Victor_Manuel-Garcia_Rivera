package Taller11.Ejemplos.UsoIncorrecto;

public abstract class Animal {
    public abstract void hacerSonido();
}

// Clase derivada que no sobrescribe el método abstracto
class Gato extends Animal {
    public void hacerSonido() {
        System.out.println("Miau");
    }
    // Aunque el método hacerSonido no es sobrescrito, se permite debido
    //  a la falta de visibilidad o error lógico
}