import java.util.Scanner;

/**
 * Clase ejecutable que permite ingresar datos de una escuela y un docente,
 * y emitir su recibo.
 * 
 * @author Ivo
 * @version 1
 */
public class Secretaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos de la escuela
        System.out.print("Ingrese nombre de la escuela: ");
        String nombreEscuela = sc.nextLine();
        System.out.print("Ingrese domicilio de la escuela: ");
        String domicilio = sc.nextLine();
        System.out.print("Ingrese nombre del director: ");
        String director = sc.nextLine();

        Escuela escuela = new Escuela(nombreEscuela, domicilio, director);

        // Datos del docente
        System.out.print("Ingrese nombre del docente: ");
        String nombreDocente = sc.nextLine();
        System.out.print("Ingrese grado del docente: ");
        String grado = sc.nextLine();
        System.out.print("Ingrese sueldo basico del docente: ");
        double sueldoBasico = sc.nextDouble();
        System.out.print("Ingrese asignacion familiar del docente: ");
        double asignacionFamiliar = sc.nextDouble();

        Docente docente = new Docente(nombreDocente, grado, sueldoBasico, asignacionFamiliar);

        // Imprimir recibo
        System.out.println("\n****** RECIBO ******");
        escuela.imprimirRecibo(docente);

        sc.close();
    }
}
