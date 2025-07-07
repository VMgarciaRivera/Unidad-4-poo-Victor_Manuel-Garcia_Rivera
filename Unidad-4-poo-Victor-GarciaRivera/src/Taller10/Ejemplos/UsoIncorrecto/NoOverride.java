package Taller10.Ejemplos.UsoIncorrecto;

// Clase base
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
// Clase derivada (sin usar @Override)
class Gato extends Animal {
    public void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}

// Explicación:Aunque el código compila y funciona,no usar @Override puede
// llevar a errores difíciles de detectar, especialmente si se cambian los
// métodos en la clase base