
/**
 * Clase laboratorio
 * @author Ivo Cespedes
 * @version 1
 */

public class Laboratorio
{
   private String nombre;
   private String domicilio;
   private String telefono;
   private int compraMinima;
   private int diaEntrega;
   
   
   /**
     * Constructor con 5 parametros
     * @param p_nombre recibe el nombre del laboratorio
     * @param p_domicilio recibe el domicilio del laboratorio
     * @param p_telefono recibe el telefono del laboratorio
     * @param p_compraMin recibe la compra de un producto
     * @param p_diaEnt recibe el dia de entrega del producto
     */
   public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt){
       this.setNombre(p_nombre);
       this.setDomicilio(p_domicilio);
       this.setTelefono(p_telefono);
       this.setCompraMinima(p_compraMin);
       this.setDiaEntrega(p_diaEnt);
   }
   
    /**
     * Constructor con 3 parametros
     * @param p_nombre recibe el nombre del laboratorio
     * @param p_domicilio recibe el domicilio del laboratorio
     * @param p_telefono recibe el telefono del laboratorio
     */
   public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
       this.setNombre(p_nombre);
       this.setDomicilio(p_domicilio);
       this.setTelefono(p_telefono);
       this.setCompraMinima(0);
       this.setDiaEntrega(0);
   }
   
   /**
    * Asigna el valor para la nueva compra minima
    * @param Recibe un valor para la compra minima
    * @return No retorna valor
      */
   public void nuevaCompraMinima(int p_compraMinima){
       this.setCompraMinima(p_compraMinima);
   }
   
   /**
    * Asigna el valor para el nuevo dia de entrega
    * @param Recibe un valor para el dia de entrega
    * @return No retorna valor
      */
   public void nuevoDiaEntrega(int p_diaEnt){
       this.setDiaEntrega(p_diaEnt);
   }

    /**
     * Devuelve un mensaje por pantalla
     * @param No recibe parametros
     * @return Retorna un mensaje con la forma "Laboratorio (nombre) 
     *                                         "Domicilio (domicilio) Telefono (telefono)
       */
   public String mostrar(){
        return "Laboratorio: "+getNombre()+ "\nDomicilio: "+getDomicilio()+ "Telefono: "+getTelefono();
   }
   
   /*Setters*/
    /**
     * Asigna el valor para el nombre
     * @param Recibe un valor para el nombre
     * @return No retorna valor
       */
   private void setNombre(String p_nombre){
       this.nombre = p_nombre;
   }

    /**
     * Asigna el valor para el domicilio
     * @param Recibe un valor para el domicilio
     * @return No retorna valor
       */
   private void setDomicilio(String p_domicilio){
       this.domicilio = p_domicilio;
   }
   
    /**
     * Asigna el valor para el telefono
     * @param Recibe un valor para el telefono
     * @return No retorna valor
       */
   private void setTelefono(String p_telefono){
       this.telefono = p_telefono;
   }

    /**
     * Asigna el valor para la compra minima
     * @param Recibe un valor para la compra minima
     * @return No retorna valor
       */
   private void setCompraMinima(int p_compraMin){
       this.compraMinima = p_compraMin;
   }
   
    /**
     * Asigna el valor para el dia de entrega
     * @param Recibe un valor para el dia de entrega
     * @return No retorna valor
       */
   private void setDiaEntrega(int p_diaEnt){
       this.diaEntrega = p_diaEnt;
   }
   
   /*Getters*/
    /**
     * Devuelve el valor del nombre
     * @param No recibe parametros
     * @return Devuelve el nombre
       */
   public String getNombre(){
       return this.nombre;
   }

    /**
     * Devuelve el valor del domicilio
     * @param No recibe parametros
     * @return Devuelve el domicilio
       */
   public String getDomicilio(){
       return this.domicilio;
   }
   
    /**
     * Devuelve el valor del telefono
     * @param No recibe parametros
     * @return Devuelve el telefono
       */
   public String getTelefono(){
       return this.telefono;
   }
   
    /**
     * Devuelve el valor de la compra minima
     * @param No recibe parametros
     * @return Devuelve la compra minima
       */
   public int getCompraMinima(){
       return this.compraMinima;
   }
   
    /**
     * Devuelve el valor del dia de entrega
     * @param No recibe parametros
     * @return Devuelve el dia de entrega
       */
   public int getDiaEntrega(){
       return this.diaEntrega;
   }
}