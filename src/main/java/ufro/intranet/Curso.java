package ufro.intranet;

import java.util.ArrayList;

public class Curso {

    //Declaramos una lista de objetos de la clase Alumno llamada alumnos.
    private ArrayList<Alumno> alumnos;

    public Curso() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumnos(Alumno alumno) {
        alumnos.add(alumno);
    }


    public void eliminarAlumnos(Alumno alumno) {
        alumnos.remove(alumno);
    }

    public boolean contieneAlumno(Alumno alumno) {
        return alumnos.contains(alumno);//Retorna true si el alumno esta o no presente.
    }


    // Método para mostrar todos los estudiantes del curso
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista de Estudiantes:\n");
        for (Alumno estudiante : alumnos) {
            sb.append(estudiante.toString()).append("\n"); // Agregar cada estudiante a la cadena
        }
        return sb.toString(); // Devuelve la lista de estudiantes en formato de texto
    }

}
