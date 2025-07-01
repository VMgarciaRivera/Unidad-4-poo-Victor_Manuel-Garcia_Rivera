package Taller1.Ejemplos.Uso_De_Super;

/* super(): Llamada al constructor de la clase padre
 Se utiliza en herencia para llamar al constructor de la clase base.*/

public class Vehiculo {
    String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }


    public class Coche extends Vehiculo {
        String marca;

        // Llama al constructor de la clase base usando `super()`
        public Coche(String tipo, String marca) {
            super(tipo);
            this.marca = marca;
        }
    }
}