package Taller8.Ejercicios.Ejercicio4;

class ClaseA {
    public void metodoA() {
        System.out.println("Método de ClaseA");
    }
}

class ClaseB {
    public void metodoB() {
        System.out.println("Método de ClaseB");
    }
}

//Intento de herencia múltiple
/*class ClaseC extends ClaseA, ClaseB { //  Esto no es válido en Java
    public void metodoC() {
        System.out.println("Método de ClaseC");
    }
}
error de compilación:
Error: ',' expected
class ClaseC extends ClaseA, ClaseB {
                           ^

*/