package Taller9.Ejercicios.Ejercicio2;

public class Pez extends Animal{
    public String tipoAgua;

    public Pez(String especie, String tipoAgua) {
        super(especie);
        this.tipoAgua = tipoAgua;
    }

    public void mostrarInformacion() {
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + tipoAgua);
    }
}
