package Taller1.Ejercicios.ejercicio1;

public class Libro {
    String titulo;
    String autor;
    int paginas;

    // Constructor por defecto
    public Libro() {
        titulo = "Sin título";
        autor = "Desconocido";
        paginas = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Método para mostrar los detalles del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
