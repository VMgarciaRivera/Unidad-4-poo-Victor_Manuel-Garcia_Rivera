package Taller15.Ejercicios.Ejercicio1.RefactorizacionAplicandoSRP;

public class LibroPersistence {
    public void guardarEnArchivo(Libro libro, String ruta) {
        System.out.println("Guardando el libro \"" + libro.getTitulo() + "\" en " + ruta);
    }
}
