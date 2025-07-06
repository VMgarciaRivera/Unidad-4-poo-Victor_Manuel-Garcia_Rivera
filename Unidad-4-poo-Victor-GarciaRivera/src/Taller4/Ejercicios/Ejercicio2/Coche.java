package Taller4.Ejercicios.Ejercicio2;

public class Coche {
    private String marca;
    private String modelo;
    private double veloicidadMaxima;

    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.veloicidadMaxima += incremento;
        } else {
            throw new IllegalArgumentException("El incremento debe ser positivo");
        }
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();

        /* Intentos de acceso directo a los atributos privados
        miCoche.marca = "Toyota";            ERROR
        miCoche.modelo = "Corolla";          ERROR
        miCoche.veloicidadMaxima = 180.0;    ERROR*/

    }
}

//los atributos private solo pueden ser accedidos dentro de la misma clase en la que fueron declarados.
