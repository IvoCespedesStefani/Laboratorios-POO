/**
 * Clase que modela un docente con nombre, grado, sueldo basico y asignacion familiar.
 * Permite calcular el sueldo total, y acceder y modificar sus atributos.
 * 
 * @author Ivo
 * @version 2
 */
public class Docente {
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    // Constructor
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacionFamiliar) {
        this.nombre = p_nombre;
        this.grado = p_grado;
        this.sueldoBasico = p_sueldoBasico;
        this.asignacionFamiliar = p_asignacionFamiliar;
    }

    // Getters
    /**
     * Devuelve el nombre del docente
     * @return nombre del docente
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el grado del docente
     * @return grado del docente
     */
    public String getGrado() {
        return this.grado;
    }

    /**
     * Devuelve el sueldo basico del docente
     * @return sueldo basico
     */
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    /**
     * Devuelve la asignacion familiar del docente
     * @return asignacion familiar
     */
    public double getAsignacionFamiliar() {
        return this.asignacionFamiliar;
    }

    // Setters
    /**
     * Modifica el nombre del docente
     * @param nombre nuevo nombre
     */
    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Modifica el grado del docente
     * @param grado nuevo grado
     */
    public void setGrado(String p_grado) {
        this.grado = p_grado;
    }

    /**
     * Modifica el sueldo basico del docente
     * @param sueldoBasico nuevo sueldo basico
     */
    public void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    /**
     * Modifica la asignacion familiar del docente
     * @param asignacionFamiliar nueva asignacion familiar
     */
    public void setAsignacionFamiliar(double p_asignacionFamiliar) {
        this.asignacionFamiliar = p_asignacionFamiliar;
    }

    // Métodos
    /**
     * Calcula el sueldo total del docente
     * @return sueldo total (sueldo basico + asignacion familiar)
     */
    public double calcularSueldo() {
        return sueldoBasico + asignacionFamiliar;
    }
}
