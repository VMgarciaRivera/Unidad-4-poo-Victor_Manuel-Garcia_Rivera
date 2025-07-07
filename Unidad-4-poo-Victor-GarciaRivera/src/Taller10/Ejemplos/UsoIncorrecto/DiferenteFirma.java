package Taller10.Ejemplos.UsoIncorrecto;

// EjemploIncorrecto1:Método Sobrescrito con Diferente Firma

// Clase base
class Vehiculo {
    public void acelerar(int velocidad) {
        System.out.println("El vehículo acelera a " + velocidad + " km/h.");
    }
}
// Clase derivada (incorrecta)
class Coche extends Vehiculo {
    // Error de compilación: Diferente firma del método
    //@Override
    public void acelerar() {
        System.out.println("El coche acelera.");
    }
}