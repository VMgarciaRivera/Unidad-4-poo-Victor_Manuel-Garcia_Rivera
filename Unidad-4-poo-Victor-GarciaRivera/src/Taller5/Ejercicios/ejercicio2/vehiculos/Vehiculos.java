package Taller5.Ejercicios.ejercicio2.vehiculos;


class Vehiculo {
    String tipo;

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}
