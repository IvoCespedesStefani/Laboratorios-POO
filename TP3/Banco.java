/**
 * Clase ejecutable Banco con menu de opciones
 * Permite probar CajaDeAhorro y CuentaCorriente
 * para un mismo titular
 * @author Ivo Cespedes
 * @version 1
 */

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear titular
        System.out.println("Ingrese datos del titular:");
        System.out.print("DNI: ");
        int dni = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Año de nacimiento: ");
        int anio = sc.nextInt();

        Persona titular = new Persona(dni, nombre, apellido, anio);

        // Crear cuentas
        CajaDeAhorro caja = new CajaDeAhorro(2135, titular, 0);
        CuentaCorriente cuenta = new CuentaCorriente(1735, titular, 0);

        int opcion;
        do {
            System.out.println("\n--- MENU BANCO ---");
            System.out.println("1. Depositar en Caja de Ahorro");
            System.out.println("2. Extraer de Caja de Ahorro");
            System.out.println("3. Depositar en Cuenta Corriente");
            System.out.println("4. Extraer de Cuenta Corriente");
            System.out.println("5. Mostrar cuentas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    System.out.print("Importe a depositar en Caja de Ahorro: ");
                    double depCaja = sc.nextDouble();
                    caja.depositar(depCaja);
                    break;
                case 2:
                    System.out.print("Importe a extraer de Caja de Ahorro: ");
                    double extCaja = sc.nextDouble();
                    caja.extraccion(extCaja);
                    break;
                case 3:
                    System.out.print("Importe a depositar en Cuenta Corriente: ");
                    double depCC = sc.nextDouble();
                    cuenta.depositar(depCC);
                    break;
                case 4:
                    System.out.print("Importe a extraer de Cuenta Corriente: ");
                    double extCC = sc.nextDouble();
                    cuenta.extraccion(extCC);
                    break;
                case 5:
                    System.out.println("\n--- DATOS DE LAS CUENTAS ---");
                    caja.mostrar();
                    cuenta.mostrar();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida!");
            }

        } while(opcion != 6);

        sc.close();
    }
}
