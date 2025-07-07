package Taller8.Ejercicios.Ejercicio4;

class Empleado {
    private String nombre;  // ← Atributo privado

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
}

class Gerente extends Empleado {
    public Gerente(String nombre) {
        super(nombre);
    }

    public void mostrarNombre() {
        // System.out.println("Nombre: " + nombre);
        //  Error de compilación nombre has private access in Empleado
    }
}

