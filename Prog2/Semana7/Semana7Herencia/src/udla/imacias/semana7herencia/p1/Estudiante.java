package udla.imacias.semana7herencia.p1;

public class Estudiante extends Persona{
    /**Atributos de la subclase Estudiante*/

    private int id;
    private String materia;
    private double notap1;
    private double notap2;
    private double notap3;
    private static int contadorId = 1;

    /**Constructores y Destructores*/
    public Estudiante() {
    }

    public Estudiante(String materia, double notap1, double notap2, double notap3) {
        this.materia = materia;
        this.notap1 = notap1;
        this.notap2 = notap2;
        this.notap3 = notap3;
    }

    public Estudiante(String nombre, String apellido, int edad, String genero, String materia, double notap1, double notap2, double notap3) {
        super(nombre, apellido, edad, genero);
        this.materia = materia;
        this.notap1 = notap1;
        this.notap2 = notap2;
        this.notap3 = notap3;
    }

    /**Metodos propios de Java*/
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNotap1() {
        return notap1;
    }

    public void setNotap1(double notap1) {
        this.notap1 = notap1;
    }

    public double getNotap2() {
        return notap2;
    }

    public void setNotap2(double notap2) {
        this.notap2 = notap2;
    }

    public double getNotap3() {
        return notap3;
    }

    public void setNotap3(double notap3) {
        this.notap3 = notap3;
    }
    /**Metodos propios del desarrollador*/
}
