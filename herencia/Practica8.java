/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Clase Practica8 del paquete herencia
 * @author espar
 */
public class Practica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Actividad 1=====");
        Poligono poligono = new Poligono();
        
        /* Las clases base pueden comportarse como sus sublases*/
        
        Object objeto = new Object();
        System.out.println("Object "+objeto);
        
        objeto = poligono;
        System.out.println("Object como oligono "+objeto);
        
        Object objeto2 = poligono;
        System.out.println("Object2 "+objeto2);
        
        Object objeto3 = new Poligono();//Diferente, se instancia un nuevo poligono
        System.out.println("Object3 "+objeto3);
        
        System.out.println("Actividad2=====");
        
        poligono = new Triangulo();
        System.out.println(poligono);// se imprime toString del triangulo
        selectorPoligonos(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);//se imprime toString de cuadrilatero
        selectorPoligonos(poligono);
        
        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
    }
    
    public static void selectorPoligonos(Poligono poligono){
        if (poligono instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        }else if (poligono instanceof Cuadrilatero){
            System.out.println("El objeto es un cuadrilatero");
        }else if(poligono instanceof Poligono){
            System.out.println("El objeto es un poligono");
        }else{
            System.out.println("El objeto no es una figura");
        }
    }
    
}
