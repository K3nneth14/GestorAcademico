/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestoracademico;

/**
 *
 * @author Kenneth
 */
public class Curso {
    private String nombre;
    private int espacioMaximo;
    private int espacioOcupado;

    /**
     * Constructor de la clase Curso.
     *
     * @param nombre Nombre del curso.
     * @param espacioMaximo Número máximo de alumnos en el curso.
     */
    public Curso(String nombre, int espacioMaximo) {
        this.nombre = nombre;
        this.espacioMaximo = espacioMaximo;
        this.espacioOcupado = 0;
    }

    // Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEspacioMaximo(int espacioMaximo) {
        this.espacioMaximo = espacioMaximo;
    }

    public int getEspacioMaximo() {
        return espacioMaximo;
    }

    public void setEspacioOcupado(int espacioOcupado) {
        this.espacioOcupado = espacioOcupado;
    }

    public int getEspacioOcupado() {
        return espacioOcupado;
    }

    /**
     * Verifica si hay espacio disponible en el curso.
     *
     * @return true si hay espacio disponible, false si el curso está lleno.
     */
    public boolean verificaEspacio() {
        return espacioOcupado < espacioMaximo;
    }
}