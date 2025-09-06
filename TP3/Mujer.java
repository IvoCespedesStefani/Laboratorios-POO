/**
 * Clase que representa a una Mujer dentro del sistema de registro civil.
 * Administra sus datos personales, estado civil y relacion con un Hombre.
 * @author Ivo
 * @version 1
 */
public class Mujer {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;

    /**
     * Constructor que inicializa una Mujer sin esposo
     * @param p_nombre nombre de la mujer
     * @param p_apellido apellido de la mujer
     * @param p_edad edad de la mujer
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }

    /**
     * Constructor que inicializa una Mujer casada con un Hombre
     * @param p_nombre nombre de la mujer
     * @param p_apellido apellido de la mujer
     * @param p_edad edad de la mujer
     * @param p_esposo hombre con el que esta casada
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casada");
        this.setEsposo(p_esposo);
    }

    // Setters

    /**
     * Asigna un nombre a la mujer
     * @param p_nombre
     * @return no devuelve ningun valor
     */
    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Asigna un apellido a la mujer
     * @param p_apellido
     * @return no devuelve ningun valor
     */
    public void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    /**
     * Asigna una edad a la mujer
     * @param p_edad
     * @return no devuelve ningun valor
     */
    public void setEdad(int p_edad) {
        this.edad = p_edad;
    }

    /**
     * Asigna un estado civil a la mujer
     * @param p_estadoCivil
     * @return no devuelve ningun valor
     */
    public void setEstadoCivil(String p_estadoCivil) {
        this.estadoCivil = p_estadoCivil;
    }

    /**
     * Asigna un esposo a la mujer
     * @param p_esposo
     * @return no devuelve ningun valor
     */
    public void setEsposo(Hombre p_esposo) {
        this.esposo = p_esposo;
    }

    // Getters

    /**
     * Devuelve el nombre de la mujer
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el apellido de la mujer
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Devuelve la edad de la mujer
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Devuelve el estado civil de la mujer
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    /**
     * Devuelve el esposo de la mujer
     * @param no recibe ningun parametro
     * @return un valor de tipo Hombre
     */
    public Hombre getEsposo() {
        return this.esposo;
    }

    // Metodos 

    /**
     * Permite a la mujer casarse con un hombre
     * @param p_hombre hombre con el que se casa
     * @return no devuelve ningun valor
     */
    public void casarseCon(Hombre p_hombre) {
        this.setEsposo(p_hombre);
        this.setEstadoCivil("Casada");
        p_hombre.setEsposa(this);
        p_hombre.setEstadoCivil("Casado");
    }

    /**
     * Permite a la mujer divorciarse de su esposo
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void divorcio() {
        if (this.getEsposo() != null) {
            this.getEsposo().setEsposa(null);
            this.getEsposo().setEstadoCivil("Divorciado");
            this.setEsposo(null);
            this.setEstadoCivil("Divorciada");
        }
    }

    /**
     * Devuelve los datos de la mujer
     * @param no recibe ningun parametro
     * @return un valor de tipo String con nombre, apellido y edad
     */
    public String datos() {
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " anios";
    }

    /**
     * Muestra por pantalla los datos de la mujer junto a su estado civil
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }

    /**
     * Muestra por pantalla con quien esta casada la mujer
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void casadaCon() {
        if (this.getEsposo() != null) {
            System.out.println(this.datos() + " esta casada con " + this.getEsposo().datos());
        }
    }
}
