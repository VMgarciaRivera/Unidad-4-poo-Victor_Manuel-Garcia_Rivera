package Taller6.Ejercicios.Ejercicio2.pruebas;


//import transporte.Moto;

import Taller6.Ejercicios.Ejercicio2.Transporte.Moto;

public class Pruebas {
    public static void main(String[] args) {
        Moto moto = new Moto("Motocicleta", "Honda", 150);

        // Acceso permitido: método público
        moto.mostrarInfo();

        // Acceso directo a atributos protected desde una clase NO relacionada
        //  Estas líneas causarán error de compilación:
        // System.out.println(moto.tipo);
        // System.out.println(moto.marca);
    }
}
