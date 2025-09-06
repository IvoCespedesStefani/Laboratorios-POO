/**
 * Permite definir un rectángulo en un plano cartesiano,
 * usando como referencia el punto de su esquina inferior izquierda (origen),
 * junto con las dimensiones ancho y alto.
 * 
 * Incluye operaciones para calcular superficie, perímetro,
 * desplazar el rectángulo, determinar el mayor entre dos rectángulos,
 * y calcular la distancia entre dos rectángulos.
 * 
 * @author Cespedes Ivo
 * @version 1
 */
public class Rectangulo {
    private Punto origen;
    private double ancho;
    private double alto;

    // Constructores

    /**
     * Constructor que crea un rectángulo en un punto específico.
     * 
     * @param p_origen punto de origen (esquina inferior izquierda)
     * @param p_ancho ancho del rectángulo
     * @param p_alto alto del rectángulo
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    /**
     * Constructor que crea un rectángulo en el origen (0,0).
     * 
     * @param p_ancho ancho del rectángulo
     * @param p_alto alto del rectángulo
     */
    public Rectangulo(double p_ancho, double p_alto){
        this.setOrigen(new Punto(0.0, 0.0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    // Setters

    /**
     * Asigna un nuevo punto de origen al rectángulo.
     * 
     * @param p_origen punto de origen
     */
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }

    /**
     * Asigna un nuevo ancho al rectángulo.
     * 
     * @param p_ancho ancho del rectángulo
     */
    public void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }

    /**
     * Asigna un nuevo alto al rectángulo.
     * 
     * @param p_alto alto del rectángulo
     */
    public void setAlto(double p_alto){
        this.alto = p_alto;
    }

    // Getters

    /**
     * Devuelve el ancho del rectángulo.
     * 
     * @return valor de tipo double
     */
    public double getAncho(){
        return this.ancho;
    }

    /**
     * Devuelve el alto del rectángulo.
     * 
     * @return valor de tipo double
     */
    public double getAlto(){
        return this.alto;
    }

    /**
     * Devuelve el punto de origen (esquina inferior izquierda).
     * 
     * @return objeto Punto
     */
    public Punto getOrigen(){
        return this.origen;
    }

    // Metodos

    /**
     * Desplaza el rectángulo trasladando su punto de origen.
     * 
     * @param p_dx desplazamiento en el eje X
     * @param p_dy desplazamiento en el eje Y
     */
    public void desplazar(double p_dx, double p_dy){
        this.origen.desplazar(p_dx, p_dy);
    }

    /**
     * Calcula y devuelve la superficie del rectángulo.
     * 
     * @return valor de tipo double representando el área
     */
    public double superficie(){
        return this.getAncho() * this.getAlto();
    }

    /**
     * Calcula y devuelve el perímetro del rectángulo.
     * 
     * @return valor de tipo double representando el perímetro
     */
    public double perimetro(){
        return 2 * (this.getAncho() + this.getAlto());
    }

    /**
     * Muestra en pantalla todas las características del rectángulo,
     * incluyendo origen, ancho, alto, superficie y perímetro.
     */
    public void caracteristicas(){
        System.out.println("****** Rectangulo ******");
        System.out.println("Origen: " + this.origen.coordenadas() +
                           " - Alto: " + this.getAlto() +
                           " - Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() +
                           " - Perimetro: " + this.perimetro());
    }

    /**
     * Calcula la distancia entre este rectángulo y otro rectángulo,
     * medida como la distancia entre sus puntos de origen.
     * 
     * @param otroRectangulo otro rectángulo a comparar
     * @return valor de tipo double representando la distancia
     */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.origen.distanciaA(otroRectangulo.getOrigen());
    }

    /**
     * Determina cuál de los dos rectángulos tiene mayor superficie.
     * 
     * @param otroRectangulo otro rectángulo a comparar
     * @return el rectángulo con mayor superficie
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() >= otroRectangulo.superficie()){
            return this;
        } else {
            return otroRectangulo;
        }
    }
}
