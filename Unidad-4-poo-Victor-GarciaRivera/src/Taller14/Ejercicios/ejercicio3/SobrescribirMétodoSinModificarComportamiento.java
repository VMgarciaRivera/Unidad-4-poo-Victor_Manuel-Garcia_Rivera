package Taller14.Ejercicios.ejercicio3;

class Persona1 {
    void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}

class Profesor extends Persona1 {
    @Override
    void presentarse() {
        //Mala práctica: se sobrescribe, pero no se cambia nada
        System.out.println("Hola, soy una persona.");
    }
}

//falsa impresión de que el comportamiento ha cambiado.
//
//Aumenta el código sin aportar valor.
//
//Rompe el principio de claridad y mantenimiento del código.
