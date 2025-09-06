/**
 * Permite visualizar y desplazar puntos de un plano
 * @author Cespedes Ivo
 * @version 2
 */
public class Punto
{
    private double x;
    private double y;
    
    /**
     * Constructor sin parametros
     * @param No recibe parametros
     */
    public Punto(){
        this.setX(0.0);
        this.setY(0.0);
    }
    
    /**
     * Constructor con dos parametros
     * @param p_x recibe las coordenadas de x
     * @param p_y recibe las coordenadas de y
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    
       //Setters

    /**
     * Asigna p_x a la coordenada de x
     * @param p_x
     * @return no devuelve ningun valor
     */
    private void setX(double p_x){
        this.x = p_x;
    }

    /**
     * Asigna p_y a la coordenada de y
     * @param p_y
     * @return no devuelve ningun valor
     */
    private void setY(double p_y){
        this.y = p_y;
    }

    //Getters
    /**
     * Devuelve la coordenada de x
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double getX(){
        return this.x;
    }

    /**
     * Devuelve la coordenada de y
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double getY(){
        return this.y;
    }

    
    /**
     * Permite desplazar las coordenadas de x e y
     * @param p_x
     * @param p_y
     * @return no devuelve ningun valor
     */
    public void desplazar (double p_dx, double p_dy){
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    /**
     * Muestra por pantallas los puntos X e Y
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void mostrar(){
        System.out.println("Punto. X: " + this.getX() + "  Y: " + this.getY());
    }
    
    /**
     * Muestra las coordenadas de X e Y
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String coordenadas(){
        return "(" + this.getX() + " " + this.getY() + ")";
    }
    
    /**
     * Calcula la distancia euclidiana entre este punto y otro punto.
     * 
     * La distancia se calcula usando la fórmula de Pitágoras:
     * d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
     * 
     * Se utiliza Math.sqrt() para obtener la raíz cuadrada de la suma de los 
     * cuadrados de las diferencias de las coordenadas.
     * 
     * @param p_ptoDistance Punto con el que se calcula la distancia
     * @return un valor de tipo double representando la distancia real entre los dos puntos
     */
    public double distanciaA(Punto p_ptoDistance){
        double dx = p_ptoDistance.getX() - this.getX();
        double dy = p_ptoDistance.getY() - this.getY();
        return Math.sqrt(dx * dx + dy * dy);
}

}
