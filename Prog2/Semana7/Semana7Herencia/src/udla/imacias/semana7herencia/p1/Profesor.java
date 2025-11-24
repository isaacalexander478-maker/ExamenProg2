package udla.imacias.semana7herencia.p1;

public class Profesor extends Persona {
    /**Atributos de la subclase Profesor*/

    private String tipoHorario;

    /**Constructores y Destructores*/
    public Profesor() {
    }

    public Profesor(String tipoHorario) {
        this.tipoHorario = tipoHorario;
    }

    public Profesor(String nombre, String apellido, int edad, String genero, String tipoHorario) {
        super(nombre, apellido, edad, genero);
        this.tipoHorario = tipoHorario;
    }

    /**Metodos propios de Java*/
    public String getTipoHorario() {
        return tipoHorario;
    }

    public void setTipoHorario(String tipoHorario) {
        this.tipoHorario = tipoHorario;
    }
    /**Metodos propios del desarrollador*/
}
