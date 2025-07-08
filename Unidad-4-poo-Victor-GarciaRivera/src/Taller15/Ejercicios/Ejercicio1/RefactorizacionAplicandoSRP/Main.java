package Taller15.Ejercicios.Ejercicio1.RefactorizacionAplicandoSRP;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("1984", "George Orwell", "Contenido distópico...");

        LibroPrinter printer = new LibroPrinter();
        printer.mostrarInformacion(libro);

        LibroReport report = new LibroReport();
        report.generarReporte(libro);

        LibroPersistence persistence = new LibroPersistence();
        persistence.guardarEnArchivo(libro, "libros/1984.txt");
    }
}

