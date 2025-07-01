package Taller1.Ejemplos.Uso_De_This;

//this(): Llamada a otro constructor en la misma clase

public class Coche {
    String marca;
    String modelo;

    // Constructor con un parámetro
    public Coche(String marca) {
        this.marca = marca;
    }

    // Llamada al constructor anterior usando `this()`
    public Coche(String marca, String modelo) {
        this(marca); // Llama al constructor de un solo parámetro
        this.modelo = modelo;
    }
}