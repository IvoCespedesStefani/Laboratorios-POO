
/**
 * Creacion de la clase para un cliente
 * 
 * @author Ivo 
 * @version 1
 */

public class Cliente{
    
    private int nroDni;
    private String apellido;
    private String nombre;
    private double saldo;
    
    /**
     * Constructor con 5 parametros
     * @param p_dni Recibe un valor para el DNI
     * @param p_apellido Recibe un valor para el apellido
     * @param p_nombre Recibe un valor para el nombre
     * @param p_importe Recibe un valor para el imporrte
       */
    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe){
        this.setDni(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }
    
    /*Setters*/
    /**
     * Establece el valor para el DNI
     * @param Recibe el valor del DNI
     * @return No devuelve valor
       */
    private void setDni(int p_dni){
        this.nroDni = p_dni;
    }
    
    /**
     * Establece el valor para el apellido
     * @param Recibe el valor del apellido
     * @return No devuelve valor
       */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Establece el valor para el nombre
     * @param Recibe el valor del nombre
     * @return No devuelve valor
       */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el valor para el importe
     * @param Recibe el valor del importe
     * @return No devuelve valor
       */
    private void setSaldo(double p_importe){
        this.saldo = p_importe;
    }
    
    /*Getters*/
    /**
     * Devuelve el valor del DNI
     * @param No recibe parametros
     * @return Devuelve el valor del DNI
       */
    public int getDni(){
        return this.nroDni;
    }
    
    /**
     * Devuelve el valor del apellido
     * @param No recibe parametros
     * @return Devuelve el valor del apellido
       */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Devuelve el valor del nombre
     * @param No recibe parametros
     * @return Devuelve el valor del nombre
       */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Devuelve el valor del saldo
     * @param No recibe parametros
     * @return Devuelve el valor del saldo
       */
    public double getSaldo(){
        return this.saldo;
    }
    
    /*Funciones*/
    /**
     * Devuelve un mensaje por pantalla
     * @param No recibe parametros
     * @return Devuelve un mensaje con la forma "Nombre y apellido (nombre y apellido)"
       */
    public void mostrar(){
        System.out.println("Nombre y Apellido: "+ this.nomYApe());
    }
    
    /**
     * Actualiza el saldo
     * @param Recibe un nuevo valor para el saldo
     * @return Devuelve un saldo actualizado
       */
    public double nuevoSaldo(double p_importe){
        return p_importe;
    }
    
    /**
     * Agrega saldo 
     * @param Recibe un saldo para sumar
     * @return Devuelve la suma del saldo actual y el saldo agregado
       */
    public double agregarSaldo(double p_importe){
        return this.getSaldo() + p_importe;
    }
    
    /**
     * Concatena el apellido y nombre
     * @param No recibe parametros
     * @return Devuelve el valor "APELLIDO NOMBRE"
       */
    public String apeYNom(){
        return this.apellido + " " + this.nombre;
    }
    
    /**
     * Concatena el nombre y apellido
     * @param No recibe parametros
     * @return Devuelve el valor "NOMBRE APELLIDO"
       */
    public String nomYApe(){
        return this.nombre + " " + this.apellido;
    }
}



















