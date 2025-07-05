package Taller2.Ejemplos.EjemplosdeUsoCorrecto;

//  EjemploCorrecto1:DiferenciacióndeAtributosyParámetros

public class Coche {
    private String marca;
    public Coche(String marca) {
        this.marca = marca; // Usamos `this` para referirnos al atributo de la clase
    }
    public void setMarca(String marca) {
        this.marca = marca; // Usamos `this` para evitar la confusión entre el atributo y el parámetro
    }
    public void mostrarMarca() {
        System.out.println("Marca: " + this.marca);
    }
}