package Taller15.Ejercicios.Ejercicio1;

public class Libro {
    private String titulo;
    private String autor;
    private String contenido;

    public Libro(String titulo, String autor, String contenido) {
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public void generarReporte() {
        System.out.println("REPORTE DEL LIBRO:");
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
    }

    public void guardarEnArchivo(String ruta) {
        System.out.println("Guardando el libro en " + ruta);
    }
}

//3 responsabilidades distintas en una sola clase:
//
//Mostrar información del libro (lógica de presentación).
//
//Generar reportes (lógica de reportes).
//
//Guardar en archivo (persistencia).