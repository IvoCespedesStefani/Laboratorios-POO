import java.util.Scanner; 

public class ArticuloScan{
    
    public static void main(String []args){
        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        try{
            System.out.println("Ingrese el codigo del articulo: ");
            int a_codigo = teclado.nextInt();
            
            System.out.println("Ingrese la descripcion del articulo: ");
            String a_desc = teclado.next();
            
            System.out.println("Ingrese el precio de articulo: ");
            float a_precio = teclado.nextFloat();
            
            System.out.println("Ingrese la tasa de incremento: ");
            float a_tasa = teclado.nextFloat();
            
            Articulo miArticulo = new Articulo(a_codigo, a_desc, a_precio);
            
            System.out.println("El articulo original es: ");
            miArticulo.mostrar();
            System.out.println("El precio aumentado en "+ a_tasa + "es " + miArticulo.incremento(a_tasa));
            
        } catch (Exception error) {
            System.out.println("Respete el formato establecido");
        }
        
    }
    
}