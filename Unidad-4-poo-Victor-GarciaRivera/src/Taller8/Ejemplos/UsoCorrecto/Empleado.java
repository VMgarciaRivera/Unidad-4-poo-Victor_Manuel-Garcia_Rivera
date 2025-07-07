package Taller8.Ejemplos.UsoCorrecto;

// Clase base
class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}

// Clase derivada
class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}

//Explicación:La clase Gerente hereda los atributos y métodos de la clase Empleado,
// y agrega su propio atributo departamento. También sobrescribe
// el método mostrarDetalles para incluir información adicional