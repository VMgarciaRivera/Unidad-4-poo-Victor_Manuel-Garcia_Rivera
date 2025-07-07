package Taller8.Ejercicios.Ejercicio2;

class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

class Estudiante extends Persona{
    public String matricula;

    public Estudiante(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarPersona() {
        super.mostrarPersona();
        System.out.println("Matricula: " + matricula);
    }
}
