package Taller9.Ejemplos.UsoCorrecto;

// EjemploCorrecto1:Invocar el Constructor de la Clase Base

public class Animal {
    protected String especie;
    public Animal(String especie) {
        this.especie = especie;
    }
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

class Gato extends Animal {
    private String color;
    public Gato(String especie, String color) {
        super(especie); // Llama al constructor de la clase base
        this.color = color;
    }
    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // Llama al método de la clase base
        System.out.println("Color: " + color);
    }
}