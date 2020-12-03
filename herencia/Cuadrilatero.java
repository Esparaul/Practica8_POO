/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Clase Cuadrilatero del paquete herencia
 * @author Raul Cruz, Carlos Mendoza
 */
public class Cuadrilatero extends Poligono{
    private int alpha, beta;
    private float a, b, base, altura;
    /**
    * Es el constuctor sin parametros.
    */
    public Cuadrilatero() {
    }
    /**
    * Es el constructor con parametros
     * @param alpha Es el angulo del cuadrilatero, es de tipo int.
    * @param beta Es el angulo del cuadrilatero, es de tipo int.
    * @param a Es un lado mas largo del cuadrilatero, es de tipo float.
    * @param b Es el lado mas corto del cuadrilatero, es de tipo float.
    * @param base Es la base del cuadrilatero, es de tipo float.
    * @param altura  Es la altura del cuadrilatero, es de tipo float.
    */
    public Cuadrilatero(int alpha, int beta, float a, float b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }
    /**
    * Getter que muestra la informacion de alpha, angulo del cuadrilatero.
    * @return alpha, es de tipo int.
    */
    public int getAlpha() {
        return alpha;
    }
    /**
    * Setter que contiene la informacion de alpha, angulo del cuadrilatero.
    * @param alpha Es de tipo int.
    */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
    * Getter que devuelve el valor de beta, angulo del cuadrilatero.
    * @return beta, es de tipo int.
     */
    public int getBeta() {
        return beta;
    }
    /**
    * Setter que almacena el valor de beta, angulo del cuadrilatero.
    * @param beta Es de tipo int.
    */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
    * Getter que tiene el valor de a, lado largo del cuadrilatero.
    * @return a, es de tipo float.
    */
    public float getA() {
        return a;
    }
    /**
    * Setter que tiene la informacion de a, lado largo del cuadrilatero.
    * @param a Es de tipo float.
    */
    public void setA(float a) {
        this.a = a;
    }
    /**
    * Getter que tiene el valor de b, lado corto del cuadrilatero.
    * @return b, es de tipo float.
    */
    public float getB() {
        return b;
    }
    /**
     * Setter que da la informacion de b, lado corto del cuadrilatero.
    * @param b Es de tipo float.
    */
    public void setB(float b) {
        this.b = b;
    }
    /**
    * Getter que contiene el valor de la base del cuadrilatero.
    * @return base, es de tipo float.
    */
    public float getBase() {
        return base;
    }
    /**
    * Setter que nos da la informacion de la base del cuadrilatero.
    * @param base Es de tipo float.
    */
    public void setBase(float base) {
        this.base = base;
    }
    /**
    * Getter que contiene el valor de la altura del cuadrilatero.
    * @return altura, es de tipo float.
    */
    public float getAltura() {
        return altura;
    }
    /**
    * Setter que da el valor de la altura del cuadrilatero.
    * @param altura Es de tipo float.
    */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
    * Metodo toString nos da la informacion general del cuadrilatero.
    * @return Informacion del cuadrilatero, es de tipo String.
    */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    } 
}
