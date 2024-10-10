package ufro.intranet;
import java.util.Scanner;

public class Menu {
    private Curso curso;
    private Scanner scanner;

    public Menu() {
        this.curso = new Curso();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("1. Agregar Alumno");
            System.out.println("2. Eliminar Alumno");
            System.out.println("3. Listar Alumnos");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    agregarAlumno();
                    break;
                case 2:
                    eliminarAlumno();
                    break;
                case 3:
                    listarAlumnos();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 4);
    }

    private void agregarAlumno() {
        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese rut: ");
        String rut = scanner.nextLine();
        System.out.println("Ingrese numero de matricula: ");
        String matricula = scanner.nextLine();
        Alumno alumno = new Alumno(nombre, apellido, rut, matricula);
        curso.agregarAlumnos(alumno);
    }

    private void eliminarAlumno() {
        System.out.println("Ingrese rut del alumno a eliminar: ");
        String rut = scanner.nextLine();
        Alumno alumno = new Alumno("", "", rut, "");
        curso.eliminarAlumnos(alumno);
    }

    private void listarAlumnos() {
        System.out.println(curso.toString());
    }
}
