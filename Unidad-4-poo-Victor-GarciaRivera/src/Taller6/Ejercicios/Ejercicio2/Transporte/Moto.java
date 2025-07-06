package Taller6.Ejercicios.Ejercicio2.Transporte;


public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // accede a tipo y marca (protected)
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}
