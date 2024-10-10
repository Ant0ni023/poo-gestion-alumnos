package ufro.intranet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    //Atributo privado para la instancia del curso
    private Curso curso;


    //Inicializar el curso antes de cada test con el proposito de usar un curso vacio para cada test
    @BeforeEach
    void setUp() {
        curso = new Curso();
    }


    //Hacemos una prueba para verificar que el metodo agregarAlumnos de la clase Curso funcione correctamente
    @Test
    void testAgregarAlumno() {
        //Creamos un alumno
        Alumno alumno = new Alumno("Juan", "Perez", "12345678-9", "123456");
        //Agregamos el alumno al curso
        curso.agregarAlumnos(alumno);
        //Verificamos que el curso contenga al alumno
        assertTrue(curso.contieneAlumno(alumno));
    }

    @Test
    void testEliminarAlumno() {
    //Creamos un alumno
        Alumno alumno = new Alumno("Eduardo", "Gonzalez", "12345678-9", "123456");
        //Agregamos el alumno al curso
        curso.agregarAlumnos(alumno);
        //eliminamos al alumno
        curso.eliminarAlumnos(alumno);
        //verificamos que el curso no contenga al alumno
        assertFalse(curso.contieneAlumno(alumno));
    }



}