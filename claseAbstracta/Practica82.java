/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 * Clase main de la clase Practica82
 * @author espar
 */
public class Practica82 {
    public static void main(String[] args) {
        System.out.println("Actividad3=====");
        //Poligono poligono = new Poligono();
        Poligono poligono;//Me deja defiirlo, pero no instanciarlo porque es qabstracto
        
        poligono = new Triangulo();
        System.out.println(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
    }
}
