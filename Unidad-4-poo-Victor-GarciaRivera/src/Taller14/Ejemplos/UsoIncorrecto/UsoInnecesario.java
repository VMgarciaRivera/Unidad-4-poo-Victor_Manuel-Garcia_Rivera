package Taller14.Ejemplos.UsoIncorrecto;

// Clase base
class Vehiculo {
    void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

// Clase derivada
class Moto extends Vehiculo {
    @Override
    void mover() {
        super.mover(); // Uso innecesario si no se modifica el comportamiento
    }
}

// Explicación: Aunque el código compila, llamar a super.mover() desde Moto es innecesario si no se modifica el comportamiento de mover en la clase
// derivada.