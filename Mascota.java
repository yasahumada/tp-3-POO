package tp3;

public class Mascota {
    // Atributos
    private final String nombre;
    private final String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        if (edad < 0) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Método para simular que cumple años
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido un año. Ahora tiene " + edad + " años.");
    }

    // Getter opcional
    public int getEdad() {
        return edad;
    }
}
