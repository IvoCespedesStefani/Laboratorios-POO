/**
 * Representa una localidad con su nombre y provincia
 * @author Cespedes Ivo
 * @version 1
 */
public class Localidad {
    private String nombre;
    private String provincia;

    /**
     * Constructor con parametros
     * @param p_nombre recibe el nombre de la localidad
     * @param p_provincia recibe el nombre de la provincia
     */
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }

    //Setters

    /**
     * Asigna p_nombre al atributo nombre
     * @param p_nombre
     * @return no devuelve ningun valor
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Asigna p_provincia al atributo provincia
     * @param p_provincia
     * @return no devuelve ningun valor
     */
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }

    //Getters

    /**
     * Devuelve el nombre de la localidad
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Devuelve el nombre de la provincia
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getProvincia(){
        return this.provincia;
    }

    /**
     * Devuelve los datos de la localidad en un formato especifico
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String mostrar(){
        return "Localidad: " + this.getNombre() + "   Provincia: " + this.getProvincia();
    }
}
