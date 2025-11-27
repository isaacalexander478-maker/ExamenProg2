public class Bibliotecario {

    private String nombre;
    private String id;
    private String turno;
    private double salario;
    private Biblioteca bibliotecaAsignada;

    public Bibliotecario(String nombre, String id, String turno, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.turno = turno;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Biblioteca getBibliotecaAsignada() {
        return bibliotecaAsignada;
    }

    public void setBibliotecaAsignada(Biblioteca bibliotecaAsignada) {
        this.bibliotecaAsignada = bibliotecaAsignada;
    }


    public void asignarBiblioteca(Biblioteca b) {
        this.bibliotecaAsignada = b;
        System.out.println("El bibliotecario " + this.nombre + " ahora trabaja en: " + b.toString());
    }
}
