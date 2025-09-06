import java.util.Scanner;

/**
 * Clase ejecutable que permite registrar matrimonios y emitir certificados.
 * Usa las clases Hombre y Mujer para modelar el sistema del Registro Civil.
 * Los datos de las personas se ingresan por teclado.
 * 
 * @author Ivo
 * @version 2
 */
public class RegistroCivil {

    /**
     * Metodo principal de la aplicacion.
     * Pide datos de un hombre y una mujer, los casa y emite un certificado.
     * @param args no se utilizan parametros en este metodo
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos del hombre
        System.out.println("=== Registro de Hombre ===");
        System.out.print("Ingrese nombre: ");
        String nombreH = sc.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellidoH = sc.nextLine();
        System.out.print("Ingrese edad: ");
        int edadH = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Hombre hombre1 = new Hombre(nombreH, apellidoH, edadH);

        // Ingreso de datos de la mujer
        System.out.println("\n=== Registro de Mujer ===");
        System.out.print("Ingrese nombre: ");
        String nombreM = sc.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellidoM = sc.nextLine();
        System.out.print("Ingrese edad: ");
        int edadM = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Mujer mujer1 = new Mujer(nombreM, apellidoM, edadM);

        // Mostrar estado civil inicial
        System.out.println("\n--- Estado civil inicial ---");
        hombre1.mostrarEstadoCivil();
        mujer1.mostrarEstadoCivil();

        // Casar a la pareja
        hombre1.casarseCon(mujer1);

        // Emitir certificado de matrimonio
        emitirCertificadoMatrimonio(hombre1, mujer1);

        sc.close();
    }

    /**
     * Emite un certificado de matrimonio en consola.
     * @param p_hombre hombre casado
     * @param p_mujer mujer casada
     * @return no devuelve ningun valor
     */
    public static void emitirCertificadoMatrimonio(Hombre p_hombre, Mujer p_mujer) {
        System.out.println("\n==============================================");
        System.out.println("        CERTIFICADO DE MATRIMONIO");
        System.out.println("==============================================");
        System.out.println("Se deja constancia que:");
        System.out.println(" - " + p_hombre.datos() + " (" + p_hombre.getEstadoCivil() + ")");
        System.out.println(" - " + p_mujer.datos() + " (" + p_mujer.getEstadoCivil() + ")");
        System.out.println("Han contraido matrimonio en el Registro Civil.");
        System.out.println("==============================================");
    }
}
