package Taller8.Ejemplos.UsoIncorrecto;

class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }
}

// Clase derivada (incorrecta)
class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
       // System.out.println(marca); // Error de compilación: 'marca' tiene acceso privado
    }
}
