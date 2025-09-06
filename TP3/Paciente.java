/**
 * Representa un paciente con su historia clinica, nombre, domicilio 
 * y las localidades donde nacio y donde vive
 * @author Cespedes Ivo
 * @version 1
 */
public class Paciente {
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;

    /**
     * Constructor con parametros
     * @param p_historia recibe la historia clinica
     * @param p_nombre recibe el nombre del paciente
     * @param p_domicilio recibe el domicilio
     * @param p_localidadNacido recibe la localidad donde nacio
     * @param p_localidadVive recibe la localidad donde vive
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacio(p_localidadNacido);
        this.setVive(p_localidadVive);
    }

    //Setters

    /**
     * Asigna p_historia al atributo historiaClinica
     * @param p_historia
     * @return no devuelve ningun valor
     */
    private void setHistoriaClinica(int p_historia){
        this.historiaClinica = p_historia;
    }

    /**
     * Asigna p_nombre al atributo nombre
     * @param p_nombre
     * @return no devuelve ningun valor
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Asigna p_domicilio al atributo domicilio
     * @param p_domicilio
     * @return no devuelve ningun valor
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }

    /**
     * Asigna la localidad de nacimiento
     * @param p_nacido
     * @return no devuelve ningun valor
     */
    public void setNacio(Localidad p_nacido){
        this.localidadNacido = p_nacido;
    }

    /**
     * Asigna la localidad de residencia actual
     * @param p_vive
     * @return no devuelve ningun valor
     */
    public void setVive(Localidad p_vive){
        this.localidadVive = p_vive;
    }

    //Getters

    /**
     * Devuelve el numero de historia clinica
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int getHistoriaClinica(){
        return this.historiaClinica;
    }

    /**
     * Devuelve el nombre del paciente
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Devuelve el domicilio del paciente
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getDomicilio(){
        return this.domicilio;
    }

    /**
     * Devuelve la localidad de nacimiento del paciente
     * @param no recibe ningun parametro
     * @return un objeto de tipo Localidad
     */
    public Localidad getNacio(){
        return this.localidadNacido;
    }

    /**
     * Devuelve la localidad de residencia del paciente
     * @param no recibe ningun parametro
     * @return un objeto de tipo Localidad
     */
    public Localidad getVive(){
        return this.localidadVive;
    }

    /**
     * Muestra por pantalla los datos del paciente en un formato especifico
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: " + this.getNombre() + "   Historia Clinica: " + this.getHistoriaClinica() + "   Domicilio: " + this.getDomicilio());
        System.out.println("Localidad: " + this.getVive().getNombre() + "   Provincia: " + this.getVive().getProvincia());
    }

    /**
     * Devuelve los datos del paciente en formato de cadena
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String cadenaDeDatos(){
        return this.getNombre() + " ...... " + this.getHistoriaClinica() + " ..... " + this.getDomicilio() + " - " + this.getVive().getNombre() + " - " + this.getVive().getProvincia();
    }
}
