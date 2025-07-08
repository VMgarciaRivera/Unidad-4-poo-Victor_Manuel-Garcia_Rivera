package Taller15.Ejercicios.Ejercicio1.RefactorizacionAplicandoSRP;

public class LibroPrinter {
    public void mostrarInformacion(Libro libro) {
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
    }
}
