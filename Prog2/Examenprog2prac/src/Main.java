import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        int menu;

        System.out.println("=== CONFIGURACIÓN INICIAL ===");
        System.out.println("--- Ingrese datos de la Biblioteca ---");

        System.out.print("Nombre de la Biblioteca: ");
        String nomBib = sc.nextLine();

        System.out.print("Dirección: ");
        String dirBib = sc.nextLine();

        System.out.print("Teléfono: ");
        String telBib = sc.nextLine();

        System.out.print("Capacidad máxima: ");
        int capBib = sc.nextInt();
        sc.nextLine(); // ¡OBLIGATORIO! Limpia el enter después del número

        // Creamos el objeto Biblioteca con los datos ingresados
        Biblioteca miBiblioteca = new Biblioteca(nomBib, dirBib, telBib, capBib);

        // ==========================================
        // PASO 2: INGRESAR DATOS DEL BIBLIOTECARIO
        // ==========================================
        System.out.println("\n--- Ingrese datos del Bibliotecario ---");

        System.out.print("Nombre del encargado: ");
        String nomEnc = sc.nextLine();

        System.out.print("ID / Cédula: ");
        String idEnc = sc.nextLine();

        System.out.print("Turno (Matutino/Vespertino): ");
        String turnoEnc = sc.nextLine();

        System.out.print("Salario: ");
        double salarioEnc = sc.nextDouble();
        sc.nextLine(); // ¡OBLIGATORIO! Limpia el enter

        // Creamos el objeto Bibliotecario
        Bibliotecario miBibliotecario = new Bibliotecario(nomEnc, idEnc, turnoEnc, salarioEnc);

        // ==========================================
        // PASO 3: ASIGNACIÓN E INTERACCIÓN INICIAL
        // ==========================================
        // Cumplimos con el requisito de asignar la biblioteca
        miBibliotecario.asignarBiblioteca(miBiblioteca);

        // Asignación requerida por el examen [cite: 33]
        miBibliotecario.asignarBiblioteca(miBiblioteca);

        System.out.println("\nBienvenido bibliotecario: " + miBibliotecario.getNombre());
        System.out.println("Trabajando en: " + miBiblioteca.toString());

        // 2. Menú Interactivo
        do {
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Agregar LIBRO");
            System.out.println("2. Agregar REVISTA");
            System.out.println("3. Mostrar TODO el inventario");
            System.out.println("4. Reporte solo LIBROS");
            System.out.println("5. Reporte solo REVISTAS");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            menu = sc.nextInt();
            sc.nextLine(); // IMPORTANTE: Limpiar el buffer después de leer un número

            switch (menu) {
                case 1:
                    // --- Lógica para agregar LIBRO ---
                    System.out.println("\n[NUEVO LIBRO]");
                    System.out.print("Título: ");
                    String titL = sc.nextLine();
                    System.out.print("Autor: ");
                    String autL = sc.nextLine();
                    System.out.print("ISBN: ");
                    String isbnL = sc.nextLine();
                    System.out.print("Precio: ");
                    double precL = sc.nextDouble();
                    System.out.print("¿Está disponible? (true/false): ");
                    boolean dispL = sc.nextBoolean();
                    System.out.print("Número de Páginas: ");
                    int pags = sc.nextInt();

                    // Crear el objeto y agregarlo a la biblioteca
                    Libro nuevoLibro = new Libro(titL, autL, isbnL, precL, dispL, pags);
                    miBiblioteca.agregarRecurso(nuevoLibro);
                    break;

                case 2:
                    // --- Lógica para agregar REVISTA ---
                    System.out.println("\n[NUEVA REVISTA]");
                    System.out.print("Título: ");
                    String titR = sc.nextLine();
                    sc.nextLine(); // Consumir salto de linea si venimos de un nextInt anterior
                    System.out.print("Autor/Editorial: ");
                    String autR = sc.nextLine();
                    System.out.print("ISBN/ISSN: ");
                    String isbnR = sc.nextLine();
                    System.out.print("Precio: ");
                    double precR = sc.nextDouble();
                    System.out.print("¿Está disponible? (true/false): ");
                    boolean dispR = sc.nextBoolean();
                    System.out.print("Número de Edición: ");
                    int edicion = sc.nextInt();

                    // Crear el objeto y agregarlo
                    Revista nuevaRevista = new Revista(titR, autR, isbnR, precR, dispR, edicion);
                    miBiblioteca.agregarRecurso(nuevaRevista);
                    break;

                case 3:
                    // --- Mostrar TODO (Punto 40 del examen) ---
                    System.out.println("\n--- INVENTARIO GENERAL ---");
                    // Usamos el getter de la biblioteca para acceder a la lista
                    if (miBiblioteca.getRecursos().isEmpty()) {
                        System.out.println("La biblioteca está vacía.");
                    } else {
                        for (Recurso r : miBiblioteca.getRecursos()) {
                            System.out.println(r.toString());
                        }
                    }
                    break;

                case 4:
                    // --- Mostrar SOLO LIBROS (Punto 41 del examen) ---
                    System.out.println("\n--- REPORTE DE LIBROS ---");
                    for (Recurso r : miBiblioteca.getRecursos()) {
                        if (r instanceof Libro) { // Filtro clave
                            System.out.println(r.toString());
                        }
                    }
                    break;

                case 5:
                    // --- Mostrar SOLO REVISTAS (Punto 42 del examen) ---
                    System.out.println("\n--- REPORTE DE REVISTAS ---");
                    for (Recurso r : miBiblioteca.getRecursos()) {
                        if (r instanceof Revista) { // Filtro clave
                            System.out.println(r.toString());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (menu != 6);

        sc.close();
    }
}




