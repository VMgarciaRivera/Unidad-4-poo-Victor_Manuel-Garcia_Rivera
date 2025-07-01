package Taller1.Ejemplos.Sobrecarga_de_Constructores;

/*Es posible definir múltiples constructores dentro de la misma clase,
cada uno con un conjunto diferente de parámetros.*/

public class Coche {
    String marca;
    String modelo;

    // Constructor por defecto
    public Coche() {
        this.marca = "Desconocida";
    }

    // Constructor parametrizado
    public Coche(String marca) {
        this.marca = marca;
    }

    // Constructor sobrecargado con dos parámetros
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
