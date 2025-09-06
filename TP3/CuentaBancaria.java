/**
 * Permite crear una clase cuenta bancaria con funcionalidades
 * de deposito, extraccion y visualizacion de datos
 * @author Ivo Cespedes
 * @version 1
 */
public class CuentaBancaria {
    
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    /**
     * Constructor con dos parametros
     * @param p_nroCuenta numero de cuenta
     * @param p_titular persona titular de la cuenta
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
    /**
     * Constructor con tres parametros
     * @param p_nroCuenta numero de cuenta
     * @param p_titular persona titular de la cuenta
     * @param p_saldo saldo inicial
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    /* Setters */
    /**
     * Asigna el numero de cuenta
     * @param p_nroCuenta numero de cuenta
     * @return no retorna valor
     */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * Asigna el saldo
     * @param p_saldo saldo de la cuenta
     * @return no retorna valor
     */
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    /**
     * Asigna el titular de la cuenta
     * @param p_titular objeto Persona titular
     * @return no retorna valor
     */
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    /* Getters */
    /**
     * Devuelve el numero de cuenta
     * @return numero de cuenta
     */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    /**
     * Devuelve el saldo
     * @return saldo actual
     */
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
     * Devuelve el titular
     * @return objeto Persona titular
     */
    public Persona getTitular(){
        return this.titular;
    }
    
    /**
     * Permite depositar dinero en la cuenta
     * @param p_importe importe a depositar
     * @return saldo actualizado
     */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    
    /**
     * Permite extraer dinero de la cuenta
     * @param p_importe importe a extraer
     * @return saldo actualizado
     */
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return this.getSaldo();
    }
    
    /**
     * Muestra los datos de la cuenta bancaria
     * @return no retorna valor
     */
    public void mostrar(){
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: " + this.getTitular().nomYApe() + 
                           " (" + this.getTitular().edad() + " años)");
        System.out.println("Saldo: " + this.getSaldo());
    }
    
    /**
     * Devuelve los datos de la cuenta bancaria en formato tabulado
     * @return String con nroCuenta, titular y saldo
     */
    @Override
    public String toString(){
        return this.getNroCuenta() + "\t" + this.getTitular().nomYApe() + "\t" + this.getSaldo();
    }
}
