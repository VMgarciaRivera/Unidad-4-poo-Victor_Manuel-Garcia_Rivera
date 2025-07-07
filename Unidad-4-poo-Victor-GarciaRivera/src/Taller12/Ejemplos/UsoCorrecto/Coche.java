package Taller12.Ejemplos.UsoCorrecto;

// Interfaz Vehiculo con un método abstracto y un método predeterminado
interface Vehiculo {
    void acelerar();

    default void encender() {
        System.out.println("El vehículo está encendido.");
    }
}

// Clase Coche que implementa la interfaz Vehiculo
public class Coche implements Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }
}

// Explicación:La clase Coche implementa la interfaz Vehiculo, heredando tanto
// el método abstracto acelerar como el método predeterminado encender.
