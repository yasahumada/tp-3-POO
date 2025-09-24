package tp3;

public final class Libro {
    // Atributos privados
    private final String titulo;
    private final String autor;
    private int añoPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion); // Usamos setter para validar
    }

    // Getters (para acceder a los atributos desde fuera de la clase)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // Setter con validación para añoPublicacion
    public void setAñoPublicacion(int año) {
        if (año > 0) { // Validación: solo años positivos
            this.añoPublicacion = año;
            System.out.println("Año de publicación modificado a " + año);
        } else {
            System.out.println("Año inválido: " + año + ". No se modificó.");
        }
    }

    // Método para mostrar información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
    }
}
