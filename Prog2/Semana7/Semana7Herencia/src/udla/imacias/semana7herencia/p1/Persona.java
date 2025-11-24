package udla.imacias.semana7herencia.p1;


public class Persona {
    /** Atributos de la superclase Persona*/
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;

    /**Creación de atributos estáticos*/
    private static int id = 69;

    /**Creación de Constantes*/
    public static final Integer NUM_HIJOS = 3;

    /** Constructores y Destructores*/
    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }

    /** Métodos propios de Java*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /** Métodos propios del desarrollador*/




}
