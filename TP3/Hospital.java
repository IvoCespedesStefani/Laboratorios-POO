/**
 * Representa un hospital con su nombre, director 
 * y la posibilidad de consultar datos filiatorios de un paciente
 * @author Cespedes Ivo
 * @version 1
 */
public class Hospital {
    private String nombreHospital;
    private String nombreDirector;

    /**
     * Constructor con parametros
     * @param p_nombre recibe el nombre del hospital
     * @param p_director recibe el nombre del director
     */
    public Hospital(String p_nombre, String p_director){
        this.setNombreHospital(p_nombre);
        this.setNombreDirector(p_director);
    }

    //Setters

    /**
     * Asigna p_nombre al atributo nombreHospital
     * @param p_nombre
     * @return no devuelve ningun valor
     */
    private void setNombreHospital(String p_nombre){
        this.nombreHospital = p_nombre;
    }

    /**
     * Asigna p_director al atributo nombreDirector
     * @param p_director
     * @return no devuelve ningun valor
     */
    private void setNombreDirector(String p_director){
        this.nombreDirector = p_director;
    }

    //Getters

    /**
     * Devuelve el nombre del hospital
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombreHospital(){
        return this.nombreHospital;
    }

    /**
     * Devuelve el nombre del director del hospital
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombreDirector(){
        return this.nombreDirector;
    }

    /**
     * Muestra por pantalla los datos filiatorios del paciente 
     * junto con los datos del hospital
     * @param p_paciente recibe un objeto de tipo Paciente
     * @return no devuelve ningun valor
     */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: " + this.getNombreHospital() + "   Director: " + this.getNombreDirector());
        System.out.println("----------------------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
    }
}
