package Taller13.Ejemplos.UsoCorrecto;

// Definición de una interfaz
interface Vehiculo {
    void acelerar();
    default void encender() {
        System.out.println("El vehículo está encendido.");
    }
}
// Clase que implementa la interfaz
class Coche implements Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }
}