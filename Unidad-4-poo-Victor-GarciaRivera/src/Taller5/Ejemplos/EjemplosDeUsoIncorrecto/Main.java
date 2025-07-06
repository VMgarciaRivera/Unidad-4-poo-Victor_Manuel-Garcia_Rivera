package Taller5.Ejemplos.EjemplosDeUsoIncorrecto;

// Ejemplo Incorrecto 1: Intentar acceder a un miembro de paquete desde fuera del paquete

//package paqueteA;

class Vehiculo {
    String marca;

    Vehiculo(String marca) {
        this.marca = marca;
    }
}
// Paquete: paqueteB
 //package paqueteB;
     //   import paqueteA.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Toyota"); // Error de compilación: Vehiculo no es visible
    }
}
