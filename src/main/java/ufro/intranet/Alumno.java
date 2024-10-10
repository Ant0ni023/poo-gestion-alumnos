package ufro.intranet;

public class Alumno {

    private String nombre;
    private String apellido;
    private String rut;
    private String numeroMatricula;

    //Declaramos un metodo constructor para poder crear un objeto de tipo Alumno con los atributos de la clase alumno.
    public Alumno(String nombre, String apellido, String rut, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.numeroMatricula = matricula;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }

    public String getnumeroMatricula() {
        return numeroMatricula;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut='" + rut + '\'' +
                ", numeroMatricula='" + numeroMatricula + '\'' +
                '}';
    }


}
