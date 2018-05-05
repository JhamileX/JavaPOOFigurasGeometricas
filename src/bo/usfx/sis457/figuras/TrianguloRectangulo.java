/*
 * Archivo que contiene la clase TrianguloRectangulo
 */

package bo.usfx.sis457.figuras;

/**
 * Clase TrianguloRectangulo que calcula el Area y Perimetro en base a sus catetos
 * @author Jhamil
 */
public class TrianguloRectangulo {
    private double CatetoA;
    private double CatetoB;
    /**
     * Método constructor, crea el Triangulo Rectangulo con las propiedades
     * catetoA y catetoB
     * @param catetoA valor tipo double
     * @param catetoB valor tipo double
     */
    public TrianguloRectangulo(double catetoA, double catetoB) {
        this.CatetoA = catetoA;
        this.CatetoB = catetoB;
    }
    /**
     * Método constructor, crea el Triangulo Rectangulo valores por defecto
     */
    public TrianguloRectangulo() {
        this(0,0);
    }
    /**
     * Método que retorna el valor del CatetoA
     * @return tipo double
     */
    public double getCatetoA() {
        return CatetoA;
    }
    /**
     * Método que retorna el valor del CatetoB
     * @return tipo double
     */
    public double getCatetoB() {
        return CatetoB;
    }
    /**
     * Método que modifica el valor del CatetoA
     * @param catetoA tipo double
     */
    public void setCatetoA(double catetoA) {
        this.CatetoA = catetoA;
    }
    /**
     * Método que modifica el valor del CatetoB
     * @param catetoB tipo double
     */
    public void setCatetoB(double catetoB) {
        this.CatetoB = catetoB;
    }
    /**
     * Método que retorna el Area del Triangulo Rectangulo
     * @return tipo double
     */
    public double getArea() {
        return (this.CatetoA*this.CatetoB/2.0);
    }
    /**
     * Método que retorna el Perimetro del Triangulo Rectangulo
     * @return tipo double
     */
    public double getPerimetro() {
        return (this.CatetoA+this.CatetoB+ Math.sqrt(Math.pow(CatetoA, 2)+Math.pow(CatetoB,2) ) );
    }
    
}
