package Taller6.Ejemplos.UsoCorrecto;

//Ejemplo Correcto 2: Métodos protected que pueden ser Sobrescritos

public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    protected void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public class Perro extends Animal {
        public Perro(String especie) {
            super(especie);
        }

        @Override
        protected void emitirSonido() {
            System.out.println("El perro ladra.");
        }
    }
}