import java.util.*;

/**
 * Permite calcular la liquidacion de sueldos 
 * @author Cespedes Ivo
 * @version 1
 */
public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    
    /**
     * Constructor con 5 parametros
     * @param p_cuil recibe el cuil del empleado
     * @param p_apellido recibe el apellido del empleado
     * @param p_nombre recibe el nombre del empleado
     * @param p_importe recibe el sueldo basico del empleado
     * @param p_anio recibe el anio de ingreso del empleado
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }
    
    /*Setters*/

    /**
     * Asigna un cuil al empleado
     * @param p_cuil
     * @return no devuelve ningun valor
     */
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }

    /**
     * Asigna un apellido al empleado
     * @param p_apellido
     * @return no devuelve ningun valor
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }

    /**
     * Asigna un nombre al empleado
     * @param p_nombre
     * @return no devuelve ningun valor
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Asigna p_importe al sueldo basico del empleado
     * @param p_importe
     * @return no devuelve ningun valor
     */
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }

    /**
     * Asigna p_anio al año de ingreso del empleado
     * @param p_anio
     * @return no devuelve ningun valor
     */
    private void setAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }

    /*Getters*/
    /**
     * Devuelve el cuil del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo long
     */
    public long getCuil(){
        return this.cuil;
    }

    /**
     * Devuelve el apellido del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getApellido(){
        return this.apellido;
    }

    /**
     * Devuelve el nombre del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Devuelve el sueldo basico del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }

    /**
     * Devuelve el año del ingreso del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int getAnioIngreso(){
        return this.anioIngreso;
    }

    
    /**
     * Calcula la antiguedad del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioIngreso();
    }
    
    /**
     * Calcula el descuento que se le aplica al sueldo basico del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    private double descuento(){
        return ((this.getSueldoBasico() * 0.02) + 1500);
    }
    
    /**
     * Calcula el adicional que le corresponde al empleado de acuerdo a su antiguedad
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    private double adicional(){
        if(this.antiguedad() < 2){
            return (this.getSueldoBasico() * 0.02);
        } if (this.antiguedad() >= 2 && this.antiguedad() < 10){
            return (this.getSueldoBasico() * 0.04);
        } else {
            return (this.getSueldoBasico() * 0.06);
        }
    }
    
    /**
     * Calcula el sueldo neto del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double sueldoNeto(){
        return this.getSueldoBasico() + this.adicional() - this.descuento();
    }
    
    /**
     * Concatena el nombre con el apellido del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Concatena el apellido con el nombre del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Muestra por pantalla los datos y sueldo del empleado
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void mostrar(){
        System.out.println("\nNombre y apellido: " + this.nomYApe());
        System.out.println("CUIL:" + this.getCuil() + "\tAntiguedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo neto: $" + this.sueldoNeto());
    }
    
    /**
     * Muestra una linea con datos y sueldo del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String mostrarLinea(){
        return "\n" + this.getCuil() + "\t" + this.apeYNom() + " ........... " + "$" + this.sueldoNeto();
    }
}
