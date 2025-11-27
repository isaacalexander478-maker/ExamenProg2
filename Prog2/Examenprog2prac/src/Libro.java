public class Libro extends Recurso {

    private int numeroPaginas;

    public Libro(String titulo, String autor, String isbn, double precio, boolean disponible, int numeroPaginas) {
        super(titulo, autor, isbn, precio, disponible);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarInfo() {
        System.out.print("[LIBRO] ");
        super.mostrarInfo();
        System.out.println(" | Páginas: " + numeroPaginas);
    }
}
