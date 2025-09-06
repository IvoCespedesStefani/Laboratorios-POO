public class PruebaArticulo{
    
    public static void main(String []args){
        
        Articulo miArticulo = new Articulo(1, "Pendrive", 75f);
        System.out.println("Articulo original: ");
        miArticulo.mostrar();
        System.out.println("Con el 10% de aumento es: " + miArticulo.incremento(10));
    }
    
}