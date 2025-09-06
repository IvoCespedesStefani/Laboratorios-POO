/**
 * Clase que modela una escuela con nombre, domicilio y director.
 * Permite emitir recibos de docentes y acceder/modificar sus atributos.
 * 
 * @author Ivo
 * @version 2.1
 */
public class Escuela {
    private String nombre;
    private String domicilio;
    private String director;

    // Constructor
    public Escuela(String p_nombre, String p_domicilio, String p_director) {
        this.nombre = p_nombre;
        this.domicilio = p_domicilio;
        this.director = p_director;
    }

    // Getters
    /**
     * Devuelve el nombre de la escuela
     * @return nombre de la escuela
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el domicilio de la escuela
     * @return domicilio de la escuela
     */
    public String getDomicilio() {
        return this.domicilio;
    }

    /**
     * Devuelve el nombre del director
     * @return nombre del director
     */
    public String getDirector() {
        return this.director;
    }

    // Setters
    /**
     * Modifica el nombre de la escuela
     * @param p_nombre nuevo nombre
     */
    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Modifica el domicilio de la escuela
     * @param p_domicilio nuevo domicilio
     */
    public void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    /**
     * Modifica el nombre del director
     * @param p_director nuevo director
     */
    public void setDirector(String p_director) {
        this.director = p_director;
    }

    // Método
    /**
     * Imprime un recibo del docente pasado como parametro
     * @param p_docente Docente del cual se imprimira el recibo
     */
    public void imprimirRecibo(Docente p_docente) {
        System.out.println("Escuela: " + this.nombre + "   Domicilio: " + this.domicilio + "   Director: " + this.director);
        System.out.println("-------------------------------------------------------");
        System.out.println("Docente: " + p_docente.getNombre());
        System.out.printf("Sueldo: ....................... $ %.2f%n", p_docente.calcularSueldo());
        System.out.printf("Sueldo Basico: ................ $ %.2f%n", p_docente.getSueldoBasico());
        System.out.printf("Asignacion familiar: .......... $ %.2f%n", p_docente.getAsignacionFamiliar());
    }
}
