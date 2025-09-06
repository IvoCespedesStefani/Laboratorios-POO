public class PruebaArgs{
    
    public static void main(String []args){
        
        int codigo = Integer.parseInt(args[0]);
        String desc = args[1];
        float precio = Float.parseFloat(args[2]);
        float tasa = Float.parseFloat(args[3]);
        
        Articulo miArticulo = new Articulo(codigo, desc, precio);
        miArticulo.mostrar();
        System.out.println("El precio aumentado en $: " +tasa + " es " +miArticulo.incremento(tasa));
        
    }
    
}