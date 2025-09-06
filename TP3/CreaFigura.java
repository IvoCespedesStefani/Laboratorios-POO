import java.util.Random;

/**
 * Clase ejecutable que permite crear y manipular objetos de tipo Circulo y Rectangulo,
 * siguiendo las consignas del ejercicio.
 * 
 * Se crean círculos y rectángulos con posiciones y dimensiones determinadas 
 * aleatoriamente, se desplazan dentro de un rango establecido, se muestran sus 
 * características, se determina cuál es el de mayor superficie y se calcula la 
 * distancia entre ellos.
 * 
 * @author Cespedes Ivo
 * @version 2
 */
public class CreaFigura
{
    /**
     * Método principal que ejecuta la lógica de creación y manipulación 
     * de círculos y rectángulos.
     * 
     * @param args no recibe parámetros desde la línea de comandos
     */
    public static void main(String[] args){
        Random unNumero = new Random();
        
        // CIRCULOS 
        
        // Crear un circulo centrado en el punto (0, 0) con radio aleatorio
        double radio1 = unNumero.nextDouble() * 100.0;
        Circulo c1 = new Circulo(radio1, new Punto(0, 0));
        
        // Desplazar el círculo a otro punto aleatorio dentro del rango (-240, -230)
        double dx = -unNumero.nextInt(240);
        double dy = -unNumero.nextInt(230);
        c1.desplazar(dx, dy);
        
        // Mostrar características del primer círculo
        System.out.println("Primer círculo:");
        c1.caracteristicas();
        System.out.println();
        
        // Crear otro círculo en (5.2, 0.5) con radio aleatorio
        double radio2 = unNumero.nextDouble() * 100.0;
        Circulo c2 = new Circulo(radio2, new Punto(5.2, 0.5));
        
        // Mostrar características del segundo circulo
        System.out.println("Segundo círculo:");
        c2.caracteristicas();
        System.out.println();
        
        // Determinar cual es el mayor y mostrar sus características
        Circulo mayorCirculo = c1.elMayor(c2);
        System.out.println("Círculo con mayor superficie:");
        mayorCirculo.caracteristicas();
        System.out.println();
        
        // Mostrar la distancia entre los centros de los dos circulos
        System.out.println("La distancia entre los dos círculos es: " + c1.distanciaA(c2));
        System.out.println("\n====================\n");
        
        
        // RECTANGULO
        
        // Crear un rectángulo situado en el punto (0, 0) con dimensiones aleatorias
        double ancho1 = 50 + unNumero.nextDouble() * 200; // ancho entre 50 y 250
        double alto1  = 50 + unNumero.nextDouble() * 200; // alto entre 50 y 250
        Rectangulo r1 = new Rectangulo(ancho1, alto1);
        
        // Desplazar el rectángulo 40 unidades a la derecha y 20 hacia abajo
        r1.desplazar(40, -20);
        
        // Mostrar características del primer rectángulo
        System.out.println("Primer rectángulo:");
        r1.caracteristicas();
        System.out.println();
        
        // Crear otro rectángulo en el punto (7.4, 4.5) con dimensiones aleatorias
        double ancho2 = 50 + unNumero.nextDouble() * 200;
        double alto2  = 50 + unNumero.nextDouble() * 200;
        Rectangulo r2 = new Rectangulo(new Punto(7.4, 4.5), ancho2, alto2);
        
        // Mostrar características del segundo rectángulo
        System.out.println("Segundo rectángulo:");
        r2.caracteristicas();
        System.out.println();
        
        // Determinar cuál es el mayor y mostrar sus características
        Rectangulo mayorRect = r1.elMayor(r2);
        System.out.println("Rectángulo con mayor superficie:");
        mayorRect.caracteristicas();
        System.out.println();
        
        // Mostrar la distancia entre los orígenes de los dos rectángulos
        System.out.println("La distancia entre los dos rectángulos es: " + r1.distanciaA(r2));
    }
}
