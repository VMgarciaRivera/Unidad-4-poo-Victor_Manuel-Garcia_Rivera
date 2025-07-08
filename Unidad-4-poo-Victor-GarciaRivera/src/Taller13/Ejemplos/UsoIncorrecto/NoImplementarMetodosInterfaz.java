package Taller13.Ejemplos.UsoIncorrecto;

// Definición de una interfaz
interface Jugador {
    void jugar();
}
// Clase incorrecta que no implementa el método jugar
//class Futbolista implements Jugador {
    // Error de compilación: La clase Futbolista debe implementar el método jugar()
//}

// Explicación:La clase Futbolista no proporciona una implementación para el método
//  jugar, lo cual genera un error de compilación