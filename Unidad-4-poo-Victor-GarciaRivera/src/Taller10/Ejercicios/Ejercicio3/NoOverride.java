package Taller10.Ejercicios.Ejercicio3;

class Animal2 {
    public void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Gato extends Animal2 {
    //Error: No se esta sobreescribiendo el metodo hacerSonido porque no se usa Override
    // y como no se uso la anotacion @Override, el compilador no lanza error
    public void hacerSonido(String extra) {
        System.out.println("Maullido " + extra);
    }
}

