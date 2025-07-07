package Taller10.Ejercicios.Ejercicio3;

class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }
}

class Perro extends Animal {
    // Firma distinta: agrega un parámetro, por lo tanto no es sobrescritura.
    //@Override
    public void hacerSonido(String tipo) {
        System.out.println("Ladrido de un " + tipo);
    }
}
