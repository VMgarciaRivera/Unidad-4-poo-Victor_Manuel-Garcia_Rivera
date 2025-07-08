package Taller14.Ejemplos;

class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}
// Clase de prueba
class SimplePolimorfismo {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido(); // Muestra: El perro ladra.
        miAnimal = new Gato();
        miAnimal.hacerSonido(); // Muestra: El gato maúlla.
    }
}