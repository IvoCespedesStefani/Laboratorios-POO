
/**
 * Creacion de una clase alumno
 * 
 * @author Cespedes Ivo
 * @version 1
 */

public class Alumno
{
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    
    /**
     * Constructor con 3 parametros
     * @param p_lu Recibe un valor para LU
     * @param p_nombre Recibe un valor para Nombre
     * @param p_apellido Recibe un valor para Apellido
       */
    public Alumno(int p_lu, String p_nombre, String p_apellido){
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
    }
    
    /*Setters*/
    /**
     * Asigna un valor para LU
     * @param Recibe un valor para LU
     * @return No retorna valor
       */
    private void setLu(int p_lu){
        this.lu = p_lu;
    }

    /**
     * Asigna un valor para el nombre
     * @param Recibe un valor para el nombre
     * @return No retorna valor
       */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Asigna un valor para el apellido
     * @param Recibe un valor para el apellido
     * @return No retorna valor
       */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Asigna un valor para la primer nota
     * @param Recibe un valor para la primer nota
     * @return No retorna valor
       */
    private void setNota1(double p_nota){
        this.nota1 = p_nota;
    }
    
    /**
     * Asigna un valor para la segunda nota
     * @param Recibe un valor para la segunda nota
     * @return No retorna valor
       */
    private void setNota2(double p_nota){
        this.nota2 = p_nota;
    }
    
    /*Getters*/
    /**
     * Devuelve el valor de LU
     * @param No recibe parametros
     * @return Retorna el valor de LU
       */
    public int getLu(){
        return this.lu;
    }
    
    /**
     * Devuelve el valor del nombre
     * @param No recibe parametros
     * @return Retorna el valor del nombre
       */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Devuelve el valor del apellido
     * @param No recibe parametros
     * @return Retorna el valor del apellido
       */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Devuelve el valor de la primer nota
     * @param No recibe parametros
     * @return Retorna el valor de la primer nota
       */
    public double getNota1(){
        return this.nota1;
    }
    
    /**
     * Devuelve el valor de la segunda nota
     * @param No recibe parametros
     * @return Retorna el valor de la segunda nota
       */
    public double getNota2(){
        return this.nota2;
    }
    
     /**
         * Calcula la nota promedio
         * @param no recibe ningun parametro
         * @return true or false
         */
        private boolean aprueba(){
            if((this.promedio() > 7.0) && (this.getNota1()  >= 6.0) && (this.getNota2()>=6.0)){
                return true;
            } else {
                return false;
            }
        }
        
        /**
         * Verifica si el alumno aprobo
         * @param no recibe ningun parametro
         * @return Un string con el texto "APROBADO" o "DESAPROBADO"
         */
        private String leyendaAprueba(){
            if(this.aprueba()){
                return "APROBADO";
            } else {
                return "DESAPROBADO";
            }
        }
        
        /**
         * Calcula el promedio de notas
         * @param no recibe ningun parametro
         * @return un valor de tipo double
         */
        public double promedio(){
            double promedio;
            return promedio = (this.getNota1() + this.getNota2()) / 2;
        }
        
        /**
         * Concatena el nombre con el apellido
         * @param no recibe ningun parametro
         * @return un valor de tipo String
         */
        public String nomYApe(){
            return this.getNombre() + " " + this.getApellido();
        }
        
        /**
         * Concatena el apellido con el nombre
         * @param no recibe ningun parametro
         * @return un valor de tipo String
         */
        public String apeYNom(){
            return this.getApellido() + " " + this.getNombre();
        }
        
        /**
         * Muestra un mensaje en pantalla con datos sobre el alumno
         * @param no recibe ningun parametro
         * @return no devuelve ningun valor
         */
        public void mostrar(){
            System.out.println("Nombre y apellido: " + this.nomYApe());
            System.out.println("LU: " + this.getLu() + "\tNotas: " + this.getNota1() + " - " +this.getNota2());
            System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
        }
    
}