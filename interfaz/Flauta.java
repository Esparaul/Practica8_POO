/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Clase Flauta del paquete interfaz
 * @author Raul Cruz, Carlos Mendoza
 */
public class Flauta extends InstrumentoViento{
    /**
    * Es el constructor sin parametros.
    */
    public Flauta() {
    }
    /**
     * Metodo String que retorna que es flauta.
     * @return "Flauta", es de tipo String.
     */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
    /**
    * Metodo String nos devuelve si pertenece a Flauta.
    * @return "Flauta {}", ya que pertence, de tipo String.
    */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
}
