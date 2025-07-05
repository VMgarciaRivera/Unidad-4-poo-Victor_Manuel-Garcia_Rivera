package Taller3.Ejercicios.Ejercicio1;

public class Coche {
    private String marca, modelo;
    static int contadorCoches = 0;

    public Coche(){
        contadorCoches++;
    }

    public static void ContadorCoches(){
        System.out.println("Numero de coches: " + contadorCoches);
    }

}
