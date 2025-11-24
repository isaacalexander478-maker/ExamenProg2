import udla.imacias.semana7herencia.p1.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estudiante alumno = new Estudiante();
        Profesor p1 = new Profesor();
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el nombre del alumno: ");
        alumno.setNombre(sc.nextLine());
        System.out.println("Ingrese el apellido del alumno: ");
        alumno.setApellido(sc.nextLine());
        System.out.println("Ingrese edad del alumno: ");
        alumno.setEdad(sc.nextInt());
        System.out.println("Ingrese el genero del alumno: ");
        alumno.setGenero(sc.nextLine());
        sc.nextLine();
        System.out.println("Ingrese la materia del alumno: ");
        alumno.setMateria(sc.nextLine());
        System.out.println("Ingrese la nota del progreso 1 del alumno: ");
        alumno.setNotap1(sc.nextDouble());
        System.out.println("Ingrese la nota del progreso 2 del alumno: ");
        alumno.setNotap2(sc.nextDouble());
        System.out.println("Ingrese la nota del progreso 3 del alumno: ");
        alumno.setNotap3(sc.nextDouble());
        sc.nextLine();

        System.out.println("----------------------------------------------");

        System.out.println("Ingrese el nombre del profesor: ");
        p1.setNombre(sc.nextLine());
        System.out.println("Ingrese el apellido del profesor: ");
        p1.setApellido(sc.nextLine());
        System.out.println("Ingrese edad del profesor: ");
        p1.setEdad(sc.nextInt());
        System.out.println("Ingrese el genero del profesor: ");
        p1.setGenero(sc.nextLine());
        sc.nextLine();
        System.out.println("Ingrese el tipo de horario del profesor: ");
        p1.setTipoHorario(sc.nextLine());
        sc.nextLine();



    }
}
