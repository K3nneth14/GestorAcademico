/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestoracademico;

/**
 *
 * @author Kenneth
 */
public class Catedratico {
    private String nombre;
    private static int contador = 0;
    private int numeroCatedratico;

    /**
     * Constructor de la clase Catedrático.
     * Asigna un número único a cada catedrático automáticamente.
     *
     * @param nombre Nombre del catedrático.
     */
    public Catedratico(String nombre) {
        this.nombre = nombre;
        this.numeroCatedratico = ++contador;
    }

    /**
     * Imprime los datos del catedrático en la consola.
     */
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre + ", Numero de Catedratico: " + numeroCatedratico);
    }
}