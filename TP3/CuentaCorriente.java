/**
 * Permite crear una clase CuentaCorriente
 * @author Ivo Cespedes
 * @version 1
 */

public class CuentaCorriente {
    
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    /**
     * Constructor con 2 parametros
     * @param p_nroCuenta numero de cuenta
     * @param p_titular persona titular de la cuenta
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular) {
        this(p_nroCuenta, p_titular, 0.0);
    }
    
    /**
     * Constructor con 3 parametros
     * @param p_nroCuenta numero de cuenta
     * @param p_titular persona titular de la cuenta
     * @param p_saldo saldo inicial
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500.0);
    }
    
    /**
     * Devuelve el numero de cuenta
     */
    public int getNroCuenta() {
        return this.nroCuenta;
    }
    
    /**
     * Asigna el numero de cuenta
     */
    public void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * Devuelve el saldo actual
     */
    public double getSaldo() {
        return this.saldo;
    }
    
    /**
     * Asigna un saldo
     */
    public void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }
    
    /**
     * Devuelve el titular de la cuenta
     */
    public Persona getTitular() {
        return this.titular;
    }
    
    /**
     * Asigna un titular a la cuenta
     */
    public void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }
    
    /**
     * Devuelve el limite de descubierto
     */
    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }
    
    /**
     * Asigna un limite de descubierto
     */
    public void setLimiteDescubierto(double p_limite) {
        this.limiteDescubierto = p_limite;
    }
    
    /**
     * Verifica si se puede extraer un importe
     * @param p_importe importe a extraer
     * @return true si es posible, false en caso contrario
     */
    public boolean puedeExtraer(double p_importe) {
        if(this.saldo - p_importe < -this.limiteDescubierto) {
            System.out.println("El importe de extraccion sobrepasa el limite de descubierto!");
            return false;
        }
        return true;
    }
    
    /**
     * Realiza una extraccion de dinero si es posible
     * @param p_importe importe a extraer
     */
    public void extraccion(double p_importe) {
        if(this.puedeExtraer(p_importe)) {
            this.saldo -= p_importe;
        }
    }
    
    /**
     * Agrega dinero a la cuenta
     * @param p_importe importe a depositar
     */
    public void depositar(double p_importe) {
        this.saldo += p_importe;
    }
    
    /**
     * Muestra los datos de la cuenta
     */
    public void mostrar() {
        System.out.println("Cuenta Corriente -- ");
        System.out.println("Nro. Cuenta: " + this.nroCuenta + " - Saldo: " + this.saldo);
        System.out.println("Titular: " + this.titular.nomYApe());
        System.out.println("Descubierto: " + this.limiteDescubierto);
    }
}
