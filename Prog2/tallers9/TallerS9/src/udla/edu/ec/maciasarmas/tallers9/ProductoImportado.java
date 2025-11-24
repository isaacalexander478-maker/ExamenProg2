package udla.edu.ec.maciasarmas.tallers9;

public class ProductoImportado extends Producto {

    /**Constructores y Destructores*/

    public ProductoImportado(String nombre, double precioCosto, int stock) {
        super(nombre, precioCosto, stock);

    }

    /**Metodos propios del desarrollador*/

    public double calcularPrecioVenta() {
        double precioBase = super.calcularPrecioVenta();
        return precioBase + (precioBase * 0.10);
    }
}
