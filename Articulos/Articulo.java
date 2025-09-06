public class Articulo {
    
    /*Descripcion de la clase
     * @autor (Ivo)
     * @version (1.0)
       */
      
    private int codigo;
    private String desc;
    private float precio;
    
    /*Constructor publico de la clase*/
    public Articulo(int p_codigo, String p_desc, float p_precio){
        this.setCodigo(p_codigo);
        this.setDesc(p_desc);
        this.setPrecio(p_precio);
    }

    /*Metodo para realizar un incremento*/
    public float incremento(float p_tasa){
        float nuevo_precio = this.precio + (this.precio * (p_tasa / 100));
        return nuevo_precio;
    }
    
    public void mostrar(){
        System.out.println("Codigo: " +this.getCodigo());
        System.out.println("Descripcion: "+ this.getDesc() + " ****** "+"Precio" + this.getPrecio());
    }
    
    /*Setters*/
    public void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    
    public void setDesc(String p_desc){
        this.desc = p_desc;
    }
    
    public void setPrecio(float p_precio){
        this.precio = p_precio;
    }
    
    /*Getters*/
    public int getCodigo() {
        return this.codigo;
    }
    
    public String getDesc(){
        return this.desc;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
}