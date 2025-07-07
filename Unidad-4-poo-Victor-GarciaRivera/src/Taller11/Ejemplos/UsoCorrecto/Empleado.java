package Taller11.Ejemplos.UsoCorrecto;

// Clase abstracta
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularSalario(); // Método abstracto

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

// Clase derivada
class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double bono) {
        super(nombre);
        this.bono = bono;
    }

    @Override
    public void calcularSalario() {
        System.out.println("El salario del gerente incluye un bono de: " + bono);
    }
}

// Explicación:La clase abstracta Empleado define un método abstracto
//  calcular Salario y un método concreto mostrarNombre.
//   LaclaseGerente extiende Empleado y proporciona su propia implementación
//   del método abstracto.