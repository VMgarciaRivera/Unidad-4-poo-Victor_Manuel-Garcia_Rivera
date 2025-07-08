package Taller14.Ejemplos.UsoCorrecto;

// Clase base
class Empleado {
    void trabajar() {
        System.out.println("El empleado está trabajando.");
    }
}

// Clases derivadas
class Gerente extends Empleado {
    @Override
    void trabajar() {
        System.out.println("El gerente está gestionando el equipo.");
    }
}

class Ingeniero extends Empleado {
    @Override
    void trabajar() {
        System.out.println("El ingeniero está diseñando.");
    }
}

// Clase de prueba
class Main {
    static void main(String[] args) {
        Empleado empleado1 = new Gerente();
        Empleado empleado2 = new Ingeniero();
        empleado1.trabajar(); // Muestra: El gerente está gestionando el equipo.
        empleado2.trabajar(); // Muestra: El ingeniero está diseñando.
    }
}