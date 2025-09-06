
/**
 * Clase para productos que comercializa una drogueria
 * 
 * @author Ivo Cespedes Stefani
 * @version 1.0
 */

public class Producto
{
    
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio lab;
    
    /**
     * Constructor con 7 parametros
     * @param p_codigo Recibe un codigo de tipo int
     * @param p_rubro Recibe el rubro de tipo String
     * @param p_desc Recibe la descripcion de tipo String
     * @param p_costo Recibe un costo de tipo Double
     * @param p_porcPtoRepo Recibe un porcentaje de punto de reposicion de tipo double
     * @param p_existMinima Recibe una existencia minima de tipo int
     * @param p_lab Recibe un laboratorio
       */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo (p_codigo);
        this.setRubro(p_rubro);
        this.setDesc(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
        this.setStock(0);
    }
    
    /**
     * Constructor con 5 parametros
     * @param p_codigo Recibe un codigo de tipo int
     * @param p_rubro Recibe el rubro de tipo String
     * @param p_desc Recibe la descripcion de tipo String
     * @param p_costo Recibe un costo de tipo Double
     * @param p_lab Recibe un laboratorio
       */
    public Producto(int p_codigo, String p_rubro, String p_desc, Double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDesc(p_desc);
        this.setCosto(p_costo);
        this.setLaboratorio(p_lab);
    }
    
    //Setters
    /**
     * Establece un valor para el codigo
     * @param Recibe un codigo de tipo int
     * @return No retorna valor
       */
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    
       /**
     * Establece un valor para el rubro
     * @param p_rubro Recibe un rubro de tipo String
     * @return No retorna valor
     */
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    
    /**
     * Establece un valor para la descripción
     * @param p_desc Recibe una descripción de tipo String
     * @return No retorna valor
     */
    private void setDesc(String p_desc){
        this.descripcion = p_desc;
    }
    
    /**
     * Establece un valor para el costo
     * @param p_costo Recibe un costo de tipo double
     * @return No retorna valor
     */
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
        /**
     * Establece un valor para el Stock
     * @param p_stock Recibe un stock de tipo int
     * @return No retorna valor;
       */
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    
    /**
     * Establece un valor para el porcentaje de punto de reposición
     * @param p_porcPtoRepo Recibe un porcentaje de tipo double
     * @return No retorna valor
     */
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    
    /**
     * Establece un valor para la existencia mínima
     * @param p_existMinima Recibe una existencia mínima de tipo int
     * @return No retorna valor
     */
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    
    /**
     * Establece un valor para el laboratorio
     * @param p_lab Recibe un objeto de tipo Laboratorio
     * @return No retorna valor
     */
    private void setLaboratorio(Laboratorio p_lab){
        this.lab = p_lab;
    }
    
    //Getters
    /**
     * Devuelve el valor del codigo
     * @param No recibe parametros
     * @return Retorna el valor del codigo
       */
    public int getCodigo(){
        return this.codigo;
    }
    
    /**
     * Devuelve el valor del rubro
     * @param No recibe parámetros
     * @return Retorna el valor del rubro
     */
    public String getRubro(){
        return this.rubro;
    }
    
    /**
     * Devuelve el valor de la descripción
     * @param No recibe parámetros
     * @return Retorna el valor de la descripción
     */
    public String getDescripcion(){
        return this.descripcion;
    }
    
    /**
     * Devuelve el valor del costo
     * @param No recibe parámetros
     * @return Retorna el valor del costo
     */
    public double getCosto(){
        return this.costo;
    }
    
    /**
     * Devuelve el valor del stock
     * @param No recibe parámetros
     * @return Retorna el valor del stock
     */
    public int getStock(){
        return this.stock;
    }
    
    /**
     * Devuelve el valor del porcentaje de punto de reposición
     * @param No recibe parámetros
     * @return Retorna el valor del porcentaje de punto de reposición
     */
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    
    /**
     * Devuelve el valor de la existencia mínima
     * @param No recibe parámetros
     * @return Retorna el valor de la existencia mínima
     */
    public int getExistMinima(){
        return this.existMinima;
    }
    
    /**
     * Devuelve el laboratorio asociado
     * @param No recibe parámetros
     * @return Retorna un objeto de tipo Laboratorio
     */
    public Laboratorio getLaboratorio(){
        return this.lab;
    }
    
    //Metodos
    /**
     * Devuelve un mensaje con los datos del laboratorio y su producto
     * @param No recibe parametros
     * @return Devuelve un mensaje por pantalla
       */
    public void mostrar(){
        System.out.println("Laboratorio: " + this.lab.getNombre());
        System.out.println("Domicilio: " + this.lab.getDomicilio() + "Telefono: " + this.lab.getTelefono());
        
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion: "+ this.getDescripcion());
        System.out.println("Precio costo: " +this.getCosto());
        System.out.println("Stock: " + this.getStock() + "Stock valorizado: " /*+ Falta funcion*/);
    }
    
    /**
     * Ajusta la cantidad de un producto
     * @param Recibe la cantidad
     * @return Devuelve la cantidad actualizada
       */
    public int ajuste(int p_cantidad){
        this.stock += p_cantidad;
        
        if (this.stock < 0) {
            this.stock = 0;
            System.out.println("El stock no puede ser negativo. Se ajustó a 0.");
        }
        
        return this.stock;
    }
    
    /**
     * Devuelve el precio de lista agregandole el 12%
     * @param No recibe parametros
     * @return Devuelve el precio de lista ajustado 
       */
    public double precioLista(){
        return this.getCosto() * 1.12;
    }
    
    /**
     * Devuelve el precio al contado
     * @param No recibe parametros
     * @return Devuelve el costo con un 5% de descuento
       */
    public double precioContado(){
        return this.getCosto() * 0.95;
    }
    
    /**
     * Devuelve el precio del stock con una rentabilidad del 12%
     * @param No recibe parametros
     * @return Devuelve el precio con una rentabilidad del 12%
       */
    public double stockValorizado(){
        return (this.getStock() * this.getCosto() * 1.12);
    }

    /**
     * Permite ajustar el Punto de Reposicion
     * @param Recibe un nuevo punto de reposicion
     * @return No devuelve valor
       */   
    public void ajustarPtoRepo(double p_porce){        
        this.setPorcPtoRepo(p_porce);
    }
    
    /**
     * Permite ajustar la existencia minima
     * @param Recibe una nueva existencia minima
     * @return No retorna valor
       */
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
    
    /**
     * Muestra un mensaje por pantalla
     * @param No recibe parametros
     * @return Devuelve un mensaje con la forma "Descripcion Precio Lista Precio Contado
       */
    public String mostrarLinea(){
        return this.getDescripcion() + precioLista() + precioContado();
    }
    
}