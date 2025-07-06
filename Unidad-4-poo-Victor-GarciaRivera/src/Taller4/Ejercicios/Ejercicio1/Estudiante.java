package Taller4.Ejercicios.Ejercicio1;

public class Estudiante {
    private String nombre;
    private double edad;
    private double notapromedio;

    //métodos get y set para cada propiedad, incluyendo validaciones en los métodos set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }
    public void setEdad(double edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }
    public double getNotapromedio() {
        return notapromedio;
    }
    public void setNotapromedio(double notapromedio) {
        if (notapromedio < 0 || notapromedio > 10) {
            throw new IllegalArgumentException("La nota promedio debe estar entre 0 y 10");
        }
        this.notapromedio = notapromedio;
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Juan Perez");
        estudiante.setEdad(20);
        estudiante.setNotapromedio(8.5);

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotapromedio());
    }

}
