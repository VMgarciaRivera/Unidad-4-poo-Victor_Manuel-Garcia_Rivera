package Taller15.Ejercicios.Ejercicio1.RefactorizacionAplicandoSRP;

public class LibroReport {
    public void generarReporte(Libro libro) {
        System.out.println("REPORTE DEL LIBRO:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Contenido: " + libro.getContenido());
    }
}
