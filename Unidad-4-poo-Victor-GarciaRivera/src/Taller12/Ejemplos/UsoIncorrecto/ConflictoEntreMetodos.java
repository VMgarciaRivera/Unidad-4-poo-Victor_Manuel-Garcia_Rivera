package Taller12.Ejemplos.UsoIncorrecto;

// Interfaz Volador
interface Volador1 {
    default void despegar() {
        System.out.println("Volador despega.");
    }
}
// Interfaz Nadador
interface Nadador {
    default void despegar() {
        System.out.println("Nadador despega.");
    }
}
// Clase incorrecta que implementa ambas interfaces
//class Anfibio implements Volador1, Nadador {
    // Error de compilación: conflicto entre los métodos predeterminados de las interfaces
//}
