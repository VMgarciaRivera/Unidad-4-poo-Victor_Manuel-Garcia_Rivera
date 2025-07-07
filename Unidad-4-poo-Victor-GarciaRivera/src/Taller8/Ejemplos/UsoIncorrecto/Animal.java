package Taller8.Ejemplos.UsoIncorrecto;

// Clase base
class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }
}

// Clase derivada (incorrecta)
class Perro extends Animal {
    public Perro(String raza) {

        super("Perro"); // error de compilacion si no se escribe el constructor de la clase base

        // No se llama al constructor de la clase base
        System.out.println("Raza: " + raza);
    }
}