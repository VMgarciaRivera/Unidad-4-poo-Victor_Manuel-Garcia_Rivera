package Taller8.Ejercicios.Ejercicio1;

class Vehiculo {
    public String marca;
    public double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}

class Coche extends Vehiculo{
    public int numeroPuertas;

    public Coche(String marca, double velocidadMaxima, int numeroPuertas){
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
