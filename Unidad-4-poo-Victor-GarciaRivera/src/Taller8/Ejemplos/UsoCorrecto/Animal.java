package Taller8.Ejemplos.UsoCorrecto;

// Clase base
class Animal {
    protected String especie;
    public Animal(String especie) {
        this.especie = especie;
    }
    public void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

// Clase derivada
class Perro extends Animal {
    private String raza;
    public Perro(String especie, String raza) {
        super(especie); // Llama al constructor de la clase base
        this.raza = raza;
    }
    public void ladrar() {
        System.out.println("El perro ladra.");
    }
    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra.");
    }
}

//Explicación:En este ejemplo, la clase Perro hereda los atributos y métodos de la clase Animal.
// Perro también agrega un nuevo atributo(raza)y
// métodos(ladrar),ysobrescribe el método emitir Sonido.