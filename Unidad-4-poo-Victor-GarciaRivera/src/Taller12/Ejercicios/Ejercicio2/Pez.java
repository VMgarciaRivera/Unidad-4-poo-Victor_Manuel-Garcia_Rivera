package Taller12.Ejercicios.Ejercicio2;

public class Pez implements Nadador, Respirador {

    @Override
    public void nadar() {
        System.out.println("El pez nada ágilmente en el agua.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez respira a través de sus branquias.");
    }
}
