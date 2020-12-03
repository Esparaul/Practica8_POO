/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Clase Practica83 del paquete interfaz
 * @author espar
 */
public class Practica83 {
    public static void main(String[] args) {
        
        //No se puede instanciar
        InstrumentoMusical instrumento;
        instrumento = new Flauta();
        instrumento.tocar();
        instrumento.afinar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
        
    }
}
