/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 * Clase abstracta Poligno del paquete claseAbstracta
 * @author espar
 */
public abstract class Poligono {
    /**
     * Metodo area, obtiene el area, pero no hay implementacion
     * @return 
     */
    public abstract float area();
    /**
     * Metodo perimetro, calcula el perimetro, no tiene implementacion
     * @return 
     */
    public abstract float perimetro();
    /**
     * Metodo toString, otorga la informacion del poligono
     * @return informacion del poligono, de tipo String
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
    
    
}
