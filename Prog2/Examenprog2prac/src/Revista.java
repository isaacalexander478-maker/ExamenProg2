public class Revista extends Recurso{

    private int numeroEdicion;

    public Revista(String titulo, String autor, String isbn, double precio, boolean disponible, int numeroEdicion) {
        super(titulo, autor, isbn, precio, disponible);
        this.numeroEdicion = numeroEdicion;
    }

    public void mostrarInfo() {
        System.out.print("[LIBRO] ");
        super.mostrarInfo();
        System.out.println(" | Edicion: " + numeroEdicion);
    }
}
