import java.util.Calendar;

/**
 * Representa a un empleado que puede tener un jefe asignado, salvo en el caso
 * del Gerente General que no tiene jefe.
 * Permite gestionar datos personales, sueldo, antiguedad y relacion con su jefe.
 * 
 * @author Cespedes Ivo
 * @version 1
 */
public class EmpleadoConJefe {
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    /**
     * Constructor con todos los parametros
     * @param p_cuil recibe el numero de CUIL
     * @param p_apellido recibe el apellido del empleado
     * @param p_nombre recibe el nombre del empleado
     * @param p_importe recibe el sueldo basico
     * @param p_fecha recibe la fecha de ingreso
     * @param p_jefe recibe el jefe del empleado (puede ser null si es gerente general)
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }

    /**
     * Constructor sin jefe
     * @param p_cuil recibe el numero de CUIL
     * @param p_apellido recibe el apellido del empleado
     * @param p_nombre recibe el nombre del empleado
     * @param p_importe recibe el sueldo basico
     * @param p_fecha recibe la fecha de ingreso
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
        this(p_cuil, p_apellido, p_nombre, p_importe, p_fecha, null);
    }

    /**
     * Constructor alternativo usando año de ingreso
     * @param p_cuil recibe el numero de CUIL
     * @param p_apellido recibe el apellido del empleado
     * @param p_nombre recibe el nombre del empleado
     * @param p_importe recibe el sueldo basico
     * @param p_anio recibe el año de ingreso
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        Calendar fecha = Calendar.getInstance();
        fecha.set(Calendar.YEAR, p_anio);
        fecha.set(Calendar.MONTH, Calendar.JANUARY);
        fecha.set(Calendar.DAY_OF_MONTH, 1);
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(fecha);
        this.setJefe(null);
    }

    // Setters

    /**
     * Asigna el numero de CUIL
     * @param p_cuil
     * @return no devuelve ningun valor
     */
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }

    /**
     * Asigna el nombre
     * @param p_nombre
     * @return no devuelve ningun valor
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Asigna el apellido
     * @param p_apellido
     * @return no devuelve ningun valor
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }

    /**
     * Asigna el sueldo basico
     * @param p_importe
     * @return no devuelve ningun valor
     */
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }

    /**
     * Asigna la fecha de ingreso
     * @param p_fecha
     * @return no devuelve ningun valor
     */
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }

    /**
     * Asigna el jefe del empleado
     * @param p_jefe
     * @return no devuelve ningun valor
     */
    private void setJefe(EmpleadoConJefe p_jefe){
        this.jefe = p_jefe;
    }

    // Getters

    /**
     * Devuelve el numero de CUIL
     * @param no recibe ningun parametro
     * @return un valor de tipo long
     */
    public long getCuil(){
        return this.cuil;
    }

    /**
     * Devuelve el nombre
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Devuelve el apellido
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getApellido(){
        return this.apellido;
    }

    /**
     * Devuelve el sueldo basico
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }

    /**
     * Devuelve la fecha de ingreso
     * @param no recibe ningun parametro
     * @return un valor de tipo Calendar
     */
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }

    /**
     * Devuelve el jefe del empleado
     * @param no recibe ningun parametro
     * @return un objeto de tipo EmpleadoConJefe (puede ser null)
     */
    public EmpleadoConJefe getJefe(){
        return this.jefe;
    }

    // Metodos 
    /**
     * Calcula la antiguedad del empleado en años
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int antiguedad(){
        Calendar hoy = Calendar.getInstance();
        return hoy.get(Calendar.YEAR) - this.getFechaIngreso().get(Calendar.YEAR);
    }

    /**
     * Calcula un descuento fijo sobre el sueldo
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    private double descuento(){
        return (this.getSueldoBasico() * 0.2) + 1500;
    }

    /**
     * Calcula el sueldo neto luego de descuentos
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double sueldoNeto(){
        return this.getSueldoBasico() - this.descuento();
    }

    /**
     * Devuelve el nombre completo en formato Apellido, Nombre
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String nomYApe(){
        return this.getApellido() + ", " + this.getNombre();
    }

    /**
     * Devuelve el nombre completo en formato Nombre Apellido
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String apeYNom(){
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Muestra los datos del empleado por pantalla
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void mostrarPantalla(){
        System.out.println(this.mostrarLinea());
    }

    /**
     * Devuelve los datos del empleado en una sola linea
     * Incluye jefe si corresponde, caso contrario "GERENTE GENERAL"
     * 
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String mostrarLinea(){
        String linea = "Nombre y Apellido: " + this.apeYNom() +
                       " - CUIL: " + this.getCuil() +
                       " - Antiguedad: " + this.antiguedad() + " años" +
                       " - Sueldo Neto: $" + this.sueldoNeto();
        if(this.getJefe() != null){
            linea += " - Responde a: " + this.getJefe().nomYApe();
        } else {
            linea += " - Responde a: GERENTE GENERAL";
        }
        return linea;
    }
}
