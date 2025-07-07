package Taller9.Ejercicios.Ejercicio3;

class ClaseBase1 {
    private String mensaje = "Hola desde la clase base";
}

class ClaseDerivada extends ClaseBase1 {
    public void mostrarMensaje() {
        //System.out.println(super.mensaje);
        // Error de compilación mensaje' has private access in 'Taller9.Ejercicios.Ejercicio3.ClaseBase1'
    }
}
