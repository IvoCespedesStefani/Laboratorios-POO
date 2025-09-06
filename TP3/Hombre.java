/**
 * Clase que representa a un Hombre dentro del sistema de registro civil.
 * Administra sus datos personales, estado civil y relacion con una Mujer.
 * @author Ivo
 * @version 1
 */
public class Hombre {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    /**
     * Constructor que inicializa un Hombre sin esposa
     * @param p_nombre nombre del hombre
     * @param p_apellido apellido del hombre
     * @param p_edad edad del hombre
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
    }

    /**
     * Constructor que inicializa un Hombre casado con una Mujer
     * @param p_nombre nombre del hombre
     * @param p_apellido apellido del hombre
     * @param p_edad edad del hombre
     * @param p_esposa mujer con la que esta casado
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casado");
        this.setEsposa(p_esposa);
    }

    // Setters

    /**
     * Asigna un nombre al hombre
     * @param p_nombre
     * @return no devuelve ningun valor
     */
    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Asigna un apellido al hombre
     * @param p_apellido
     * @return no devuelve ningun valor
     */
    public void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    /**
     * Asigna una edad al hombre
     * @param p_edad
     * @return no devuelve ningun valor
     */
    public void setEdad(int p_edad) {
        this.edad = p_edad;
    }

    /**
     * Asigna un estado civil al hombre
     * @param p_estadoCivil
     * @return no devuelve ningun valor
     */
    public void setEstadoCivil(String p_estadoCivil) {
        this.estadoCivil = p_estadoCivil;
    }

    /**
     * Asigna una esposa al hombre
     * @param p_esposa
     * @return no devuelve ningun valor
     */
    public void setEsposa(Mujer p_esposa) {
        this.esposa = p_esposa;
    }

    // Getters

    /**
     * Devuelve el nombre del hombre
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el apellido del hombre
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Devuelve la edad del hombre
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Devuelve el estado civil del hombre
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    /**
     * Devuelve la esposa del hombre
     * @param no recibe ningun parametro
     * @return un valor de tipo Mujer
     */
    public Mujer getEsposa() {
        return this.esposa;
    }

    // Metodos de logica

    /**
     * Permite al hombre casarse con una mujer
     * @param p_mujer mujer con la que se casa
     * @return no devuelve ningun valor
     */
    public void casarseCon(Mujer p_mujer) {
        this.setEsposa(p_mujer);
        this.setEstadoCivil("Casado");
        p_mujer.setEsposo(this);
        p_mujer.setEstadoCivil("Casada");
    }

    /**
     * Permite al hombre divorciarse de su esposa
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void divorcio() {
        if (this.getEsposa() != null) {
            this.getEsposa().setEsposo(null);
            this.getEsposa().setEstadoCivil("Divorciada");
            this.setEsposa(null);
            this.setEstadoCivil("Divorciado");
        }
    }

    /**
     * Devuelve los datos del hombre
     * @param no recibe ningun parametro
     * @return un valor de tipo String con nombre, apellido y edad
     */
    public String datos() {
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " anios";
    }

    /**
     * Muestra por pantalla los datos del hombre junto a su estado civil
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }

    /**
     * Muestra por pantalla con quien esta casado el hombre
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void casadoCon() {
        if (this.getEsposa() != null) {
            System.out.println(this.datos() + " esta casado con " + this.getEsposa().datos());
        }
    }
}
