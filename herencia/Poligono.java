/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Clase Poligono del paquete herencia
 * @author Raul Cruz, Carlos Mendoza
 */
public class Poligono {
    /**
     * Es el metodo constructor sin parametros
     */
    public Poligono() {
    }
    /**
     * Método que nos otorga el area del poligono, empieza desde cero, ya por ahora no hay figura.
     * @return 0 Es el area del poligono, es de tipo float.
     */
    public float area(){
        return 0;
    }
    /**
     * Metodo que nos calcula el perimetro del poligono, empieza desde cero, ya que no hay figura.
     * @return 0 Es el perimetro del poligono, es de tipo float.
     */
    public float perimetro() {
    return 0;
    }
    /**
    * Metodo toString nos da la informacion del poligono
    * @return Informacion del poligono, es de tipo String
    */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }  
}
