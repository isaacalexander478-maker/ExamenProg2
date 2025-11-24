package udla.edu.ec.maciasarmas.tallers9;
import java.util.ArrayList;

public class Inventario {

    /**Atributos de la clase Inventario*/
    private ArrayList<Producto> productos;
    private int maxStock;
    private double presupuesto;

    /**Constructores y Destructores*/

    public Inventario(int capacidadMax, double presupuestoInicial) {
        this.productos = new ArrayList<>();
        this.maxStock = capacidadMax;
        this.presupuesto = presupuestoInicial;
    }

    /**Metodos propios del desarrollador*/

    private Producto buscarProducto(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    private int calcularStockTotal() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getStock();
        }
        return total;
    }



    public void agregarProducto(Producto p){


        if(calcularStockTotal() + p.getStock() > maxStock){
            System.out.println("No hay espacio suficiente en el almacén");
            return;

        }

        double costoTotal = p.getStock() * p.getPrecioCosto();
        if(costoTotal > presupuesto){
            System.out.println("Presupuesto insuficiente para la compra");
            return;
        }

        presupuesto -= costoTotal;
        productos.add(p);
        System.out.println("Producto agregado con exito");
    }

    public void venderProducto(int id, int cantidad){

        Producto p = buscarProducto(id);

        if (p == null){
            System.out.println("Producto no encontrado");
        }

        if(p.getStock() < cantidad){
            System.out.println("Stock insuficiente");
            return;
        }

        p.ventaStock(cantidad);

        double dineroIngresado = cantidad * p.calcularPrecioVenta();
        presupuesto += dineroIngresado;

        System.out.println("Producto vendido con exito, se ingreso: " + dineroIngresado + "$");
    }

    public void reabastecerProducto(int id, int cantidad) {
        Producto p = buscarProducto(id);

        if (p == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        // Validar Espacio
        if (calcularStockTotal() + cantidad > maxStock) {
            System.out.println("El almacén esta lleno");
            return;
        }

        // Validar Presupuesto
        double costoCompra = cantidad * p.getPrecioCosto();
        if (costoCompra > presupuesto) {
            System.out.println("No hay presupuesto suficiente.");
            return;
        }

        // Ejecutar compra
        p.compraStock(cantidad);
        presupuesto -= costoCompra;
        System.out.println("Reabastecimiento exitoso. Se gasto " + costoCompra + "$");
    }

    public void mostrarEstado() {
        System.out.println("\n--- ESTADO ACTUAL ---");
        System.out.println("Presupuesto: $" + presupuesto);
        System.out.println("Espacio de Inventario: " + calcularStockTotal() + "/" + maxStock);
        for (Producto p : productos) {
            System.out.println(p.mostrarInfo() + " | Precio Venta: $" + p.calcularPrecioVenta());
        }
    }

}
