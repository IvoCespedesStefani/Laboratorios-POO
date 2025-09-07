import java.util.Scanner;
import java.util.Calendar;

/**
 * Clase ejecutable que permite crear empleados y emitir permisos de salida.
 * El permiso se encuentra firmado por el jefe correspondiente, o por el 
 * Gerente General en caso de no tener jefe asignado.
 * 
 * @author Cespedes Ivo
 * @version 1
 */
public class FirmarPermiso {
    
    /**
     * Metodo principal de ejecucion
     * @param args no recibe parametros
     * @return no devuelve ningun valor
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos del jefe (puede ser Gerente General)
        System.out.println("=== Datos del jefe (o Gerente General) ===");
        System.out.print("CUIL: ");
        long cuilJefe = sc.nextLong();
        sc.nextLine(); // limpiar buffer

        System.out.print("Apellido: ");
        String apellidoJefe = sc.nextLine();

        System.out.print("Nombre: ");
        String nombreJefe = sc.nextLine();

        System.out.print("Sueldo basico: ");
        double sueldoJefe = sc.nextDouble();

        System.out.print("Año de ingreso: ");
        int anioJefe = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        EmpleadoConJefe jefe = new EmpleadoConJefe(
            cuilJefe, apellidoJefe, nombreJefe, sueldoJefe, anioJefe
        );

        // Ingreso de datos del empleado
        System.out.println("\n=== Datos del empleado ===");
        System.out.print("CUIL: ");
        long cuilEmpleado = sc.nextLong();
        sc.nextLine(); // limpiar buffer

        System.out.print("Apellido: ");
        String apellidoEmpleado = sc.nextLine();

        System.out.print("Nombre: ");
        String nombreEmpleado = sc.nextLine();

        System.out.print("Sueldo basico: ");
        double sueldoEmpleado = sc.nextDouble();

        System.out.print("Año de ingreso: ");
        int anioEmpleado = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        // Crear fecha de ingreso del empleado
        Calendar fechaEmp = Calendar.getInstance();
        fechaEmp.set(Calendar.YEAR, anioEmpleado);
        fechaEmp.set(Calendar.MONTH, Calendar.JANUARY);
        fechaEmp.set(Calendar.DAY_OF_MONTH, 1);

        // Crear empleado con jefe asignado
        EmpleadoConJefe empleado = new EmpleadoConJefe(
            cuilEmpleado, apellidoEmpleado, nombreEmpleado, sueldoEmpleado, fechaEmp, jefe
        );

        // Mostrar datos del empleado
        System.out.println("\n--- Informacion del empleado ---");
        empleado.mostrarPantalla();

        // Emitir permiso de salida
        System.out.println("\n=== Permiso de salida ===");
        System.out.print("Motivo de salida: ");
        String motivo = sc.nextLine();

        System.out.print("Hora de salida (HH:MM): ");
        String horaSalida = sc.nextLine();

        System.out.print("Hora de regreso (HH:MM): ");
        String horaRegreso = sc.nextLine();

        // Imprimir permiso
        System.out.println("\n-------------------------------");
        System.out.println("PERMISO DE SALIDA");
        System.out.println("Empleado: " + empleado.apeYNom());
        System.out.println("Motivo: " + motivo);
        System.out.println("Hora de salida: " + horaSalida);
        System.out.println("Hora de regreso: " + horaRegreso);
        System.out.println("-------------------------------");

        if(empleado.getJefe() != null){
            System.out.println("Firma: " + empleado.getJefe().apeYNom());
        } else {
            System.out.println("Firma: GERENTE GENERAL");
        }

        sc.close();
    }
}
