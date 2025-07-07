package Taller9.Ejemplos.UsoIncorrecto;

//Ejemplo Incorrecto 2: Uso Innecesario de super

public class Vehiculo {
    protected String tipo;

    public void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void mostrarTipo() {
        super.mostrarTipo(); // Uso innecesario si el método no está sobrescrito o modificado
        System.out.println("Este es un tipo de bicicleta.");
    }
}