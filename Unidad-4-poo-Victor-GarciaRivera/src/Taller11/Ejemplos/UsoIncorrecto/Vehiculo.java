package Taller11.Ejemplos.UsoIncorrecto;

// Clase abstracta
public abstract class Vehiculo {
    public abstract void conducir(); // Método abstracto
}
// Clase derivada incorrecta
//class Coche extends Vehiculo {
    // Error de compilación: La clase Coche debe implementar el método abstracto conducir()
//}

// Explicación:La clase Coche no proporciona una implementación del
// método abstracto conducir, lo cual genera un error de compilación.