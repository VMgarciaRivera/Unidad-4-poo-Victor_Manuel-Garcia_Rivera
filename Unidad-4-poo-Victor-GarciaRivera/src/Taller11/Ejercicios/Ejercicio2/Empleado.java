package Taller11.Ejercicios.Ejercicio2;

public abstract class Empleado {
    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Detalles del empleado:" + calcularSalario());

    }
}

class Gerente extends Empleado {
    private double salarioBase;
    private double bonificacion;

    public Gerente(double salarioBase, double bonificacion) {
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }
}

class Vendedor extends Empleado {
    private double salarioBase;
    private double comision;

    public Vendedor(double salarioBase, double comision) {
        this.salarioBase = salarioBase;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}
