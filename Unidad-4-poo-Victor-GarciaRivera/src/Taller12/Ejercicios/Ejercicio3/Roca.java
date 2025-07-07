package Taller12.Ejercicios.Ejercicio3;

interface Cantante {
    void cantar();
}

class Roca implements Cantante {
    @Override
    public void cantar() {
        //Implementación sin sentido
        System.out.println("..."); // Las rocas no cantan
    }
}
