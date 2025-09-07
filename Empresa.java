import java.util.*;

public class Empresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // === Empleado con anio de ingreso ===
        System.out.println("=== Cargar empleado con año de ingreso ===");
        System.out.print("Ingrese CUIL: ");
        long cuil1 = sc.nextLong();
        sc.nextLine(); // limpiar buffer
        System.out.print("Ingrese apellido: ");
        String apellido1 = sc.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre1 = sc.nextLine();
        System.out.print("Ingrese sueldo basico: ");
        double sueldo1 = sc.nextDouble();
        System.out.print("Ingrese año de ingreso: ");
        int anioIngreso = sc.nextInt();

        Empleado e1 = new Empleado(cuil1, apellido1, nombre1, sueldo1, anioIngreso);

        // === Empleado con fecha completa ===
        System.out.println("\n=== Cargar empleado con fecha completa ===");
        System.out.print("Ingrese CUIL: ");
        long cuil2 = sc.nextLong();
        sc.nextLine(); // limpiar buffer
        System.out.print("Ingrese apellido: ");
        String apellido2 = sc.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Ingrese sueldo basico: ");
        double sueldo2 = sc.nextDouble();
        System.out.print("Ingrese dia de ingreso: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese mes de ingreso (1-12): ");
        int mes = sc.nextInt() - 1; // Calendar usa meses desde 0 (enero=0)
        System.out.print("Ingrese anio de ingreso: ");
        int anio = sc.nextInt();

        Calendar fechaIngreso = new GregorianCalendar(anio, mes, dia);
        Empleado e2 = new Empleado(cuil2, apellido2, nombre2, sueldo2, fechaIngreso);

        // === Mostrar resultados ===
        System.out.println("\n--- DATOS DEL EMPLEADO 1 ---");
        e1.mostrar();
        System.out.println(e1.mostrarLinea());
        System.out.println("Es aniversario? " + e1.esAniversario());

        System.out.println("\n--- DATOS DEL EMPLEADO 2 ---");
        e2.mostrar();
        System.out.println(e2.mostrarLinea());
        System.out.println("Es aniversario? " + e2.esAniversario());

        sc.close();
    }
}
