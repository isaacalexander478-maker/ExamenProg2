import udla.edu.ec.maciasarmas.tallers9.Inventario;
import udla.edu.ec.maciasarmas.tallers9.ProductoImportado;
import udla.edu.ec.maciasarmas.tallers9.ProductoNacional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese la cantidad máxima del almacen");
        int capacidad = sc.nextInt();

        System.out.println("Ingrese el presupuesto inicial");
        double presupuesto = sc.nextDouble();

        Inventario e1 = new Inventario(capacidad, presupuesto);

        int menu = 0;

        do {

            System.out.println("CONTROL DE INVENTARIO");
            System.out.println("Selecccione una opcion");
            System.out.println("1. Agregar Producto Nacional");
            System.out.println("2. Agregar Producto Internacional");
            System.out.println("3. Vender Producto");
            System.out.println("4. Reabastecer Stock");
            System.out.println("5. Consultar Productos");
            System.out.println("6. Salir");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    agregarNacional(sc, e1);
                    break;

                case 2:
                    agregarImportado(sc, e1);
                    break;

                case 3:
                    menuVender(sc, e1);
                    break;

                case 4:
                    menuReabastecer(sc, e1);

                case 5:
                    e1.mostrarEstado();
                    break;

                case 6:
                    System.out.println("Hasta pronto");
                    break;

                default:
                    System.out.println("Opcion invalida");

            }
        } while (menu != 6);

    }

        /**Metodos del menú*/

        public static void agregarNacional(Scanner sc,Inventario e1) {

            System.out.println("Nombre del producto: ");
            String nombre = (sc.nextLine());

            System.out.println("Precio del producto: ");
            double costo = sc.nextDouble();

            System.out.println("Cantidad del producto: ");
            int stock = sc.nextInt();
            sc.nextLine();

            System.out.println("Provincia de origen: ");
            String dep = sc.nextLine();

            ProductoNacional pn = new ProductoNacional(nombre, costo, stock, dep);
            e1.agregarProducto(pn);

        }


            public static void agregarImportado(Scanner sc, Inventario e1) {
                System.out.print("Nombre del producto importado: ");
                String nombre = sc.nextLine();

                System.out.print("Precio del producto importado: ");
                double costo = sc.nextDouble();

                System.out.print("Cantidad del producto importado: ");
                int stock = sc.nextInt();
                sc.nextLine();


                ProductoImportado pi = new ProductoImportado(nombre, costo, stock);
                e1.agregarProducto(pi);
            }

            // Opción 3
            public static void menuVender(Scanner sc, Inventario e1) {
                System.out.print("\nIngrese el ID del producto a vender: ");
                int id = sc.nextInt();
                System.out.print("Cantidad a vender: ");
                int cant = sc.nextInt();


                e1.venderProducto(id, cant);
            }

            // Opción 4
            public static void menuReabastecer(Scanner sc, Inventario e1) {
                System.out.print("\nIngrese el ID del producto a reabastecer: ");
                int id = sc.nextInt();
                System.out.print("Cantidad a comprar: ");
                int cant = sc.nextInt();

                e1.reabastecerProducto(id, cant);
            }

        }





