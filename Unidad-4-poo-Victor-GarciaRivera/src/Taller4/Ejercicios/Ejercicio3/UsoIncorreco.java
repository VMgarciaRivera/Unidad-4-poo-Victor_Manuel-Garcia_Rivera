package Taller4.Ejercicios.Ejercicio3;

// Clase A con atributo privado
class claseA {
    private int numero = 10;
}

// Clase B que intenta acceder directamente a la propiedad privada de ClaseA
public class UsoIncorreco {
    public static void main(String[] args) {
        claseA objeto = new claseA();
        //System.out.println(objeto.numero); -->  error numero tiene acceso privado en UsoIncorreco
    }
}
