/**
 * Permite crear una clase persona
 * @author Ivo Cespedes 
 * @version 2
 */

import java.util.*;

public class Persona{
    
    int nroDni;
    String nombre;
    String apellido;
    Calendar fechaNacimiento;

        /**
     * Constructor con 4 parámetros.
     * Se mantiene para retrocompatibilidad con programas que usaban año como int.
     * @param p_dni recibe el dni de la persona
     * @param p_nombre recibe el nombre de la persona
     * @param p_apellido recibe el apellido de la persona
     * @param p_anio recibe el año de nacimiento de la persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
    /**
     * Constructor con Calendar.
     * @param p_dni recibe el dni de la persona
     * @param p_nombre recibe el nombre de la persona
     * @param p_apellido recibe el apellido de la persona
     * @param p_fecha recibe la fecha completa de nacimiento
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    
    //   SETTERS             
    
    /**
     * Asigna un número de dni
     * @param p_dni Recibe un valor para el DNI
     */
    private void setDni(int p_dni){
        this.nroDni = p_dni;
    }
    
    /**
     * Asigna un nombre
     * @param p_nombre Recibe un valor para el nombre
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Asigna un apellido
     * @param p_apellido Recibe un valor para el apellido
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Asigna un año de nacimiento.
     * Este método se mantiene por **retrocompatibilidad** con los programas
     * que ya usaban la clase Persona con `int anioNac`.
     * Internamente, crea un objeto Calendar con día y mes por defecto.
     * @param p_anio Recibe un valor para el año de nacimiento
     */
    private void setAnioNacimiento(int p_anio){
        this.fechaNacimiento = new GregorianCalendar();
        this.fechaNacimiento.set(Calendar.YEAR, p_anio);
        this.fechaNacimiento.set(Calendar.MONTH, 0); // Enero
        this.fechaNacimiento.set(Calendar.DAY_OF_MONTH, 1); // Día 1
    }
    
    /**
     * Asigna la fecha completa de nacimiento
     * @param p_fecha Objeto Calendar con la fecha de nacimiento
     */
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    
    //  GETTERS            
    
    /**
     * Devuelve el número de dni
     * @return Devuelve el número de DNI
     */
    public int getDni(){
        return this.nroDni;
    }
    
    /**
     * Devuelve el nombre
     * @return Devuelve el nombre
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Devuelve el apellido
     * @return Devuelve el apellido
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Devuelve el año de nacimiento.
     * Este método se mantiene por **retrocompatibilidad** con los programas
     * que ya usaban la clase Persona con `int anioNac`.
     * Internamente devuelve el año del atributo `fechaNacimiento`.
     * @return Año de nacimiento (int)
     */
    public int getNacimiento(){
        return this.fechaNacimiento.get(Calendar.YEAR);
    }
    
    /**
     * Devuelve el año de nacimiento desde el objeto Calendar
     * @return Año de nacimiento (int)
     */
    public int getAnioNacimiento(){
        return this.fechaNacimiento.get(Calendar.YEAR);
    }
    
    /**
     * Devuelve la fecha completa de nacimiento
     * @return Objeto Calendar con la fecha de nacimiento
     */
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    /*   MÉTODOS             */

    /**
     * Retorna la edad de una persona
     * @return Devuelve la edad de la persona
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int anioNac = getAnioNacimiento();

        int edad = anioHoy - anioNac;
        
        // Ajusta si aún no cumplió años este año
        int mesHoy = fechaHoy.get(Calendar.MONTH);
        int diaHoy = fechaHoy.get(Calendar.DAY_OF_MONTH);
        if (mesHoy < fechaNacimiento.get(Calendar.MONTH) || 
            (mesHoy == fechaNacimiento.get(Calendar.MONTH) && diaHoy < fechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        return edad;
    }
    
    /**
     * Concatena el nombre con el apellido
     * @return Devuelve un string con la forma "NOMBRE APELLIDO"
     */
    public String nomYApe(){
        return getNombre() + " " + getApellido();
    }
    
    /**
     * Concatena el apellido con el nombre
     * @return Devuelve un string con la forma "APELLIDO NOMBRE"
     */
    public String apeYNom(){
        return getApellido() + " " + getNombre();
    }
    
    /**
     * Muestra un mensaje por pantalla con el nombre, apellido y edad
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + getNombre() + " " + getApellido());
        System.out.println("Edad: " + edad() + " años");
    }
    
    /**
     * Comprueba si hoy es el cumpleaños de la persona
     * @return true si es cumpleaños, false si no
     */
    public boolean esCumpleanios(){
        Calendar hoy = new GregorianCalendar();
        return (hoy.get(Calendar.DAY_OF_MONTH) == fechaNacimiento.get(Calendar.DAY_OF_MONTH) &&
                hoy.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH));
    }
}
