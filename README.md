package POO;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        if (calificacion < 0) this.calificacion = 0;
        else if (calificacion > 10) this.calificacion = 10;
        else this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        if (calificacion > 10) calificacion = 10;
        System.out.println("Se aumentó la calificación en " + puntos + " puntos.");
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) calificacion = 0;
        System.out.println("Se disminuyó la calificación en " + puntos + " puntos.");
    }
}
