/**
 * Clase para la creacion de circulos
 * 
 * @author Ivo
 * @version 2
 */
public class Circulo
{
   private double radio;
   private Punto centro;
   
   // Constructores
   public Circulo(double p_radio, Punto p_centro){
       this.setRadio(p_radio);
       this.setCentro(p_centro);
   }
   
   public Circulo(){
       this.setRadio(0);
       this.setCentro(new Punto(0, 0));
   }
   
   // Setters
   private void setCentro(Punto p_centro){
       this.centro = p_centro;
   }
   
   private void setRadio(double p_radio){
       this.radio = p_radio;
   }
   
   // Getters
   public Punto getCentro(){
       return this.centro;
   }
   
   public double getRadio(){
       return this.radio;
   }
   
   // Métodos
   /**
    * Desplaza el circulo sumando dx y dy a su centro
    * @param p_dx Recibe el valor dx
    * @param p_dy Recibe el valor dy
    * @return No retorna valor
    */
   public void desplazar(double p_dx, double p_dy){
       this.centro.desplazar(p_dx, p_dy);
   }
   
   /**
    * Calcula el perímetro del círculo: 2 * PI * radio
    */
   public double perimetro(){
       return 2 * Math.PI * this.radio;
   }
   
   /**
    * Calcula la superficie del círculo: PI * radio^2
    */
   public double superficie(){
       return Math.PI * this.radio * this.radio;
   }
   
   /**
    * Muestra todas las características del círculo
    */
   public void caracteristicas(){
       System.out.println("****** Circulo ******");
       System.out.println("Centro: (" + this.centro.getX() + ", " + this.centro.getY() + ") - Radio: " + this.radio);
       System.out.println("Superficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
   }
   
   /**
    * Calcula la distancia entre el centro de este círculo y otro círculo
    */
   public double distanciaA(Circulo otroCirculo){
       return this.centro.distanciaA(otroCirculo.getCentro());
   }
   
   /**
    * Retorna el círculo que tiene mayor superficie entre este y otro círculo
    */
   public Circulo elMayor(Circulo otroCirculo){
       if(this.superficie() >= otroCirculo.superficie()){
           return this;
       } else {
           return otroCirculo;
       }
   }
}
