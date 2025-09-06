/**
 * Permite crear una clase persona
 * @author Ivo Cespedes 
 * @version 1
 */

import java.util.*;
public class Persona{
    
    int nroDni;
    String nombre;
    String apellido;
    int anioNac;
    
    /**
     * Constructor con 4 parametros.
     * @param p_dni recibe el dni de la persona
     * @param p_nombre recibe el nombre de la persona
     * @param p_apellido recibe el apellido de la persona
     * @param p_anio recibe el anio de nacimiento de la persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
    /**
       *Retorna la edad de una persona
       *@param no recibe parametros
       *@return Devuelve la edad de la persona
       */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return anioHoy - getNacimiento();
    }
    
    /**
       *Concatena el nombre con el apellido
       *@param No recibe ningun parametro
       *@return Devuelve un string con la forma "NOMBRE APELLIDO"
       */
    public String nomYApe(){
        return getNombre() + " " + getApellido();
    }
    
    /**
       *Concatena el apellido con el nombre
       *@param No recibe ningun parametro
       *@return Devuelve un string con la forma "APELLIDO NOMBRE"
       */
    public String apeYNom(){
        return getApellido() + " " + getNombre();
    }
    
    /**
     * Muestra un mensaje por pantalla con el nombre, apellido y edad
     * @Param no recibe ningun parametro
     * @return Retorna un mensaje por pantalla
       */
    public void mostrar(){
        System.out.println("Nombre y Apellido: "+ getNombre() + getApellido());
        System.out.println("Edad: " + edad() + "años");
    }
    
    /*Setters*/
    /**
     * Asigna un numero de dni
     * @param Recibe un valor para el DNI
     * @return No retorna valor
       */
    private void setDni(int p_dni){
        this.nroDni = p_dni;
    }
    
    /**
     * Asigna un nombre
     * @param Recibe un valor para el nombre
     * @return No retorna valor
       */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Asigna un apellido
     * @param Recibe un valor para el apellido
     * @return No retorna valor
       */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Asigna un año de nacimiento
     * @param Recibe un valor para el año de nacimiento
     * @return No retorna valor
       */
    private void setAnioNacimiento(int p_anio){
        this.anioNac = p_anio;
    }
    
    /*Getters*/
    /**
     * Devuelve el numero de dni
     * @param No recibe parametros
     * @return Devuelve el numero de DNI
       */
    public int getDni(){
        return this.nroDni;
    }
    
    /**
     * Devuelve el nombre
     * @param No recibe parametros
     * @return Devuelve el nombre
       */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Devuelve el apellido
     * @param No recibe parametros
     * @return Devuelve el apellido
       */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Devuelve el año de nacimiento
     * @param No recibe parametros
     * @return Devuelve año de nacimiento
       */
    public int getNacimiento(){
        return this.anioNac;
    }
}