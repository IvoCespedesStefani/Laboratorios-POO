import java.util.Scanner;

/**
 * Clase ejecutable que permite gestionar un hospital y sus pacientes.
 * Solicita datos por teclado e imprime los datos filiatorios 
 * utilizando los metodos definidos en las clases Hospital, Paciente y Localidad.
 * 
 * @author Cespedes Ivo
 * @version 1
 */
public class GestionHospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Datos del hospital ---
        System.out.println("Ingrese el nombre del hospital: ");
        String nombreHospital = sc.nextLine();

        System.out.println("Ingrese el nombre del director: ");
        String nombreDirector = sc.nextLine();

        Hospital hospital = new Hospital(nombreHospital, nombreDirector);

        // --- Datos del paciente ---
        System.out.println("Ingrese el nombre del paciente: ");
        String nombrePaciente = sc.nextLine();

        System.out.println("Ingrese el numero de historia clinica: ");
        int historiaClinica = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.println("Ingrese el domicilio del paciente: ");
        String domicilio = sc.nextLine();

        // --- Localidad de nacimiento ---
        System.out.println("Ingrese el nombre de la localidad donde nacio el paciente: ");
        String localidadNacNombre = sc.nextLine();

        System.out.println("Ingrese la provincia de nacimiento: ");
        String localidadNacProvincia = sc.nextLine();

        Localidad localidadNac = new Localidad(localidadNacNombre, localidadNacProvincia);

        // --- Localidad de residencia ---
        System.out.println("Ingrese el nombre de la localidad donde vive el paciente: ");
        String localidadViveNombre = sc.nextLine();

        System.out.println("Ingrese la provincia de residencia: ");
        String localidadViveProvincia = sc.nextLine();

        Localidad localidadVive = new Localidad(localidadViveNombre, localidadViveProvincia);

        // Instanciar paciente
        Paciente paciente = new Paciente(historiaClinica, nombrePaciente, domicilio, localidadNac, localidadVive);

        // --- Mostrar datos ---
        System.out.println("\n========= DATOS DEL PACIENTE =========");
        paciente.mostrarDatosPantalla();

        System.out.println("\n========= CADENA DE DATOS =========");
        System.out.println(paciente.cadenaDeDatos());

        System.out.println("\n========= DATOS FILIATORIOS =========");
        hospital.consultaDatosFiliatorios(paciente);

        sc.close();
    }
}
