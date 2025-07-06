package Taller5.Ejercicios.ejercicio2.vehiculos;


class Moto extends Vehiculo {
    String marca;

    Moto(String tipo, String marca) {
        super(tipo);
        this.marca = marca;
    }

    void mostrarInfo() {
        mostrarTipo();
        System.out.println("Marca: " + marca);
    }
}

