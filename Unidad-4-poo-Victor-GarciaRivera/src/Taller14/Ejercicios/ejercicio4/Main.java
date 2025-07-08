package Taller14.Ejercicios.ejercicio4;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Coche();      // Polimorfismo: referencia Vehiculo, objeto Coche
        Vehiculo v2 = new Bicicleta();  // Polimorfismo: referencia Vehiculo, objeto Bicicleta

        v1.mover();  // Llama al método de Coche
        v2.mover();  // Llama al método de Bicicleta
    }
}

