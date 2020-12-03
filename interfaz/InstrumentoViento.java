/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Clase InstrumentoViento del paquete interfaz
 * @author Raul Cruz, Carlos Mendoza
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{
    /**
    * Es el constructor sin parametros.
    */
    public InstrumentoViento() {
    }
    
    @Override
    public void tocar(){
        System.out.println("Estoy tocando un instrumento de viento");
    }
    
    @Override
    public void afinar(){
        System.out.println("Estoy afinando un instrumento de viento");
    }
    /**
     * Metodo String que devuelve que es instrumento de viento.
     * @return "Instrumento de viento", es de tipo String.
     */
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
    /**
    * Metodo String devuele que es instrumento de viento
    * @return Informacion del instrumento, es de tipo String.
    */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
}
