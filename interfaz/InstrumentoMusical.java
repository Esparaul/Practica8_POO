/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Interfaz IbstrumentoMusical del paquete interfaz
 * @author espar
 */
public interface InstrumentoMusical {
    //Por defecto todos los metodos son public y abstract
    /**
     * Es un contrato sobre lo que se va hacer en las clases.
     */
    //
    /**
     * Metodo tocar
     */
    void tocar();
    /**
     * Metodo afinar
     */
    void afinar();
    /**
     * Metodo String muestra el tipo de instrumento.
     * @return Informacion del instrumento.
     */
    String tipoInstrumento();
    
    
}
