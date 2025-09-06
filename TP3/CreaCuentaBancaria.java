/**
 * Clase ejecutable para probar la clase CuentaBancaria
 * Permite crear varias cuentas bancarias ingresando datos por teclado
 * y realizar operaciones mediante un menu interactivo
 * @author Ivo Cespedes
 * @version 2
 */

import java.util.*;

public class CreaCuentaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos para la primera cuenta
        System.out.println("=== Creacion de la primera cuenta ===");
        System.out.print("Ingrese DNI del titular: ");
        int dni1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre1 = sc.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido1 = sc.nextLine();

        System.out.print("Ingrese año de nacimiento: ");
        int año1 = sc.nextInt();

        Persona titular1 = new Persona(dni1, nombre1, apellido1, año1);

        System.out.print("Ingrese numero de cuenta: ");
        int nroCuenta1 = sc.nextInt();

        System.out.print("Ingrese saldo inicial: ");
        double saldo1 = sc.nextDouble();

        CuentaBancaria cuenta1 = new CuentaBancaria(nroCuenta1, titular1, saldo1);

        // Ingreso de datos para la segunda cuenta
        System.out.println("\n=== Creacion de la segunda cuenta ===");
        System.out.print("Ingrese DNI del titular: ");
        int dni2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre2 = sc.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido2 = sc.nextLine();

        System.out.print("Ingrese año de nacimiento: ");
        int año2 = sc.nextInt();

        Persona titular2 = new Persona(dni2, nombre2, apellido2, año2);

        System.out.print("Ingrese numero de cuenta: ");
        int nroCuenta2 = sc.nextInt();

        CuentaBancaria cuenta2 = new CuentaBancaria(nroCuenta2, titular2);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Depositar en cuenta 1");
            System.out.println("2. Extraer de cuenta 1");
            System.out.println("3. Depositar en cuenta 2");
            System.out.println("4. Extraer de cuenta 2");
            System.out.println("5. Mostrar cuentas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese monto a depositar en cuenta 1: ");
                    double dep1 = sc.nextDouble();
                    cuenta1.depositar(dep1);
                    break;
                case 2:
                    System.out.print("Ingrese monto a extraer de cuenta 1: ");
                    double ext1 = sc.nextDouble();
                    cuenta1.extraer(ext1);
                    break;
                case 3:
                    System.out.print("Ingrese monto a depositar en cuenta 2: ");
                    double dep2 = sc.nextDouble();
                    cuenta2.depositar(dep2);
                    break;
                case 4:
                    System.out.print("Ingrese monto a extraer de cuenta 2: ");
                    double ext2 = sc.nextDouble();
                    cuenta2.extraer(ext2);
                    break;
                case 5:
                    System.out.println("\n=== Datos de las cuentas ===");
                    cuenta1.mostrar();
                    cuenta2.mostrar();
                    break;
                case 6:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        }

        sc.close();
    }
}
