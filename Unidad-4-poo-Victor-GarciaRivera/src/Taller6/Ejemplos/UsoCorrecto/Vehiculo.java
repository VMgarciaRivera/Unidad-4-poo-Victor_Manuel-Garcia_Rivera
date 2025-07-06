package Taller6.Ejemplos.UsoCorrecto;

//EjemploCorrecto1:AtributosprotectedenunaClaseBase

public class Vehiculo {
    protected String marca;
    protected double velocidad;

    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    protected void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + " km/h");
    }

    public class Coche extends Vehiculo {
        private int puertas;

        public Coche(String marca, double velocidad, int puertas) {
            super(marca, velocidad);
            this.puertas = puertas;
        }

        public void mostrarInformacion() {
            mostrarDetalles(); // Accede al método protegido de la clase base
            System.out.println("Número de puertas: " + puertas);
        }
    }
}