public class Recurso {

    /**Atributos de la superclase Recurso*/
    protected String titulo;
    protected String autor;
    protected String isbn;
    protected double precio;
    protected boolean disponible;

    /**Constructores y Destructores*/

    public Recurso(String titulo, String autor, String isbn, double precio, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.disponible = disponible;
    }

    /**Getters y Setters*/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**Métodos del desarrollador*/

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Precio: $" + precio);
    }

}
