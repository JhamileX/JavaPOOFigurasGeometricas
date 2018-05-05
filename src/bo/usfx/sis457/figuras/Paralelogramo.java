/*
 * Arcchivo que contiene la clase Paralelogramo
 */

package bo.usfx.sis457.figuras;

/**
 * Clase Paralelogramo que calcula el Area y Perimetro en base a su
 * Base y Altura
 * @author Jhamil
 */
public class Paralelogramo {
    private double Base;
    private double Altura;

    /**
     * Método constructor, crea el Paralelogramo con las propiedades base y altura
     * @param base Valor tipo double
     * @param altura Valor tipo double
     */
       
    public Paralelogramo(double base, double altura) {
        this.Base = base;
        this.Altura = altura;
    }
    /**
     * Metodo Constructor,crea el paralelogramo con valores por defecto
     */
    public Paralelogramo() {
        //Llamoa al Método constructor anterior
        this(0,0);
    }
    /**
     * Método que retorna el valor de la Base
     * @return Retorna el valor de la Base en tipo double
     */
    public double getBase() {
        return Base;
    }
    /**
     * Método que retorna el valor de la Altura
     * @return Retorna el valor de la Altura en tipo double
     */
    public double getAltura() {
        return Altura;
    }
    /**
     * Método que modifica el valor de la Base
     * @param base valor de tipo double
     */
    public void setBase(double base) {
        this.Base = base;
    }
    /**
     * Método que modifica el valor de la Altura
     * @param altura valor de tipo double  
     */
    public void setAltura(double altura) {
        this.Altura = altura;
    }
    /**
     * Método que retorna el Area del Paralelogramo
     * @return valor de tipo double
     */
    public double getArea() {
        return (this.Altura*this.Base);
    }
    /**
     * Método que retorna el Perimetro del Paralelogramo
     * @return valor de tipo double
     */
    public double getPerimetro(){
        return (this.Altura*this.Base*2);
    }
    
}
