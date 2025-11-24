package udla.edu.ec.maciasarmas.tallers9;

public class Producto {
    /**Atributos de la superclase Producto*/

    private static int contadorId = 1;

    private int id;
    private String nombre;
    private int stock;
    private double precioCosto;

    /**Constructores y Destructores*/

    public Producto(String nombre, double precioCosto, int stock) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.stock = stock;
        this.precioCosto = precioCosto;
    }

    /**Metodos propios de Java*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    /**Metodos propios del desarrollador*/

    //Método para calcular el precio base
    public double calcularPrecioVenta(){

        return precioCosto * 1.15;
    }

    //Metodo cuando vendemos stock
    public void ventaStock(int cantidad){
        if(cantidad <= stock){
            stock -= cantidad;
        }
    }

    public void compraStock(int cantidad){
            stock += cantidad;

    }

    //Metodo para mostrar la informacion
    public String mostrarInfo(){
        return "ID: " + id + "" + " Producto: " + nombre + "" + " Stock: " + stock;
    }
}
