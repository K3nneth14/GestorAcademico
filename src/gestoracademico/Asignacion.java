/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestoracademico;

/**
 *
 * @author Kenneth
 */

public class Asignacion {
    private Alumno alumno;
    private Curso curso;

    /**
     * Constructor de la clase Asignacion.
     * Asigna un curso al alumno y actualiza el espacio del curso.
     *
     * @param alumno Alumno que se va a asignar al curso.
     * @param curso Curso al que se asignará el alumno.
     */
    public Asignacion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
        addCurso();
    }

    /**
     * Agrega un curso al alumno si hay espacio disponible.
     */
    public void addCurso() {
        if (curso.verificaEspacio()) {
            curso.setEspacioOcupado(curso.getEspacioOcupado() + 1);
            System.out.println("Curso asignado con exito a: " + alumno.getNombre());
        } else {
            System.out.println("No hay espacio disponible en el curso: " + curso.getNombre());
        }
    }
}