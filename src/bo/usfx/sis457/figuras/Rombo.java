/*
 * Archivo que contiene la Clase Rombo
 */
package bo.usfx.sis457.figuras;

/**
 * Clase Rombo que calcula el Area y Perímetro en base a sus diagonales
 * @author Jhamil
 */
public class Rombo {
    private double DMayor,DMenor;

    /**
     * Método constructor, crea el Rombo con las propiedades dMayor y dMenor
     * @param dMayor Valor tipo double
     * @param dMenor Valor tipo double
     */
    public Rombo(double dMayor,double dMenor) {
        this.DMayor = dMayor;
        this.DMenor = dMenor;
    }

    /**
     * Método constructor, crea el Rombo con valores por defecto
     */
    public Rombo() {
        this.DMayor = 0;
        this.DMenor = 0;
    }

    /**
     * Método que retorna el valor de la diagonal mayor 
     * @return Retorna el valor de la diagonal en tipo double
     */
    public double getDiagonalMayor() {
        return this.DMayor;
    }
    
    /**
     * Método que retorna el valor de la diagonal menor 
     * @return Retorna el valor de la diagonal en tipo double
     */
    public double getDiagonalMenor() {
        return this.DMenor;
    }
    /**
     * 
     * @param DMayor 
     */
    public void setDMayor(double DMayor) {
        this.DMayor = DMayor;
    }

    public void setDMenor(double DMenor) {
        this.DMenor = DMenor;
    }

   
    
    /**
     * Método que retorna el area del Rombo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return  (this.DMayor*this.DMenor/2.0);
    }
    
    /**
     * Método que retorna el perimetro del Rombo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (Math.sqrt(Math.pow(this.DMayor,2)*Math.pow(this.DMenor,2))*2.0);
    }
}
