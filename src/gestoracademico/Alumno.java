/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestoracademico;

/**
 *
 * @author Kenneth
 */
public class Alumno {
    private String nombre;
    private static int contador = 0;
    private int carnet;

    /**
     * Constructor de la clase Alumno.
     * Asigna un carnet único a cada alumno automáticamente.
     *
     * @param nombre Nombre del alumno.
     */
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.carnet = ++contador;
    }

    /**
     * Imprime los datos del alumno en la consola.
     */
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre + ", Carnet: " + carnet);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarnet() {
        return carnet;
    }
}
