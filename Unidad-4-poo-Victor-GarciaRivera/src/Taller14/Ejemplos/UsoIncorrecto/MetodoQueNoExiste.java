package Taller14.Ejemplos.UsoIncorrecto;

// Clase base
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

// Clase derivada
class Perro extends Animal {
    void correr() {
        System.out.println("El perro está corriendo.");
    }
}

// Clase de prueba (incorrecta)
class Main {
    static void main(String[] args) {
        Animal miAnimal = new Perro();
        //miAnimal.correr(); Error de compilación: El método correr() no existe en Animal
    }
}