package udla.edu.ec.maciasarmas.tallers9;

public class ProductoNacional extends Producto {

    /**Atributos de la subclase ProductoNacional*/

    private String departamento;

    /**Constructores y Destructores*/

    public ProductoNacional(String nombre, double precioCosto, int stock, String departamento) {
        super(nombre, precioCosto, stock);
        this.departamento = departamento;
    }

    /**Metodos propios del desarrollador*/

    public double calcularPrecioVenta() {
        return super.calcularPrecioVenta();

    }
}
