/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestoracademico;

/**
 *
 * @author Kenneth
 */
public class Main {
 public static void main(String[] args) {
        // Instanciar Catedráticos
        Catedratico c1 = new Catedratico("Carlos Perez");
        Catedratico c2 = new Catedratico("Ana Lopez");
        Catedratico c3 = new Catedratico("Luis Fernandez");

        // Instanciar Cursos
        Curso curso1 = new Curso("Matematicas", 2);
        Curso curso2 = new Curso("Fisica", 5);
        Curso curso3 = new Curso("Ciencias", 5);

        // Instanciar Alumnos
        Alumno a1 = new Alumno("Juan Garcia");
        Alumno a2 = new Alumno("Maria Rodriguez");
        Alumno a3 = new Alumno("Pedro Sanchez");

        // Asignar Cursos
        new Asignacion(a1, curso1);
        new Asignacion(a2, curso1);
        new Asignacion(a3, curso1); // Debería imprimir que no hay espacio

        new Asignacion(a1, curso2);
        new Asignacion(a2, curso2);
        new Asignacion(a3, curso2);

        // Imprimir Datos
        c1.imprimirDatos();
        c2.imprimirDatos();
        c3.imprimirDatos();

        a1.imprimirDatos();
        a2.imprimirDatos();
        a3.imprimirDatos();
    }
}