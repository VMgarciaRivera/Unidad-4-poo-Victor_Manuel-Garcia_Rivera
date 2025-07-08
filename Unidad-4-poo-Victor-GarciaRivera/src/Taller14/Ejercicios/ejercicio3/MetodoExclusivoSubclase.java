package Taller14.Ejercicios.ejercicio3;

class Persona {
    void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}

class Estudiante extends Persona {
    void estudiar() {
        System.out.println("Estoy estudiando.");
    }
}

class Main {
    static void main(String[] args) {
        Persona p = new Estudiante();
        p.presentarse();

       // p.estudiar(); Error de compilación: el método estudiar() no está definido en Persona
    }
}

//error: cannot find symbol
//        p.estudiar();
//         ^
//  symbol:   method estudiar()
//  location: variable p of type Persona
