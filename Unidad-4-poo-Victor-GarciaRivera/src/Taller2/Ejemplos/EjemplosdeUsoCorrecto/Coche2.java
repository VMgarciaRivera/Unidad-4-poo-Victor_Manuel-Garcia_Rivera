package Taller2.Ejemplos.EjemplosdeUsoCorrecto;

//EjemploCorrecto2:LlamadaaOtroConstructorconthis()

public class Coche2 {
    private String marca;
    private int velocidadMaxima;
    public Coche2() {
        this("Desconocida", 0); // Llama al constructor de dos parámetros
    }
    public Coche2(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca + ", Velocidad máxima: " + this.velocidadMaxima);
    }
}