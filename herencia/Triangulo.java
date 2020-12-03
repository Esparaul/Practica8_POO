/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Clase Triangulo del paquete herencia
 * @author Raul Cruz, Carlos Mendoza.
 */
public class Triangulo extends Poligono{
    private float a, b, c, base, altura;
    private int alfa, beta, gamma;
    /**
    * Es el constructor sin parametros
     */
    public Triangulo() {
    }
    /**
    * Es el constructor con parametros.
    * @param a Es un lado del triangulo, es de tipo float.
    * @param b Es un lado del triangulo, es de tipo float.
    * @param c Es un lado del trinagulo, es de tipo float.
    * @param base Es la base del triangulo, es de tipo float.
    * @param altura Es la altura del triangulo, es de tip float.
    * @param alfa Es un angulo del triangulo, es de tipo int.
    * @param gamma Es un angulo del triangulo, es de tipo int.
    * @param beta  Es un angulo del triangulo, es de tipo int.
    */
    public Triangulo(float a, float b, float c, float base, float altura, int alfa, int beta, int gamma) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
    }
    /**
    * Getter que nos devuelve el lado a del trnagulo.
    * @return a, de tipo float
    */
    public float getA() {
        return a;
    }
    /**
    * Setter que nos da el lado A del triangulo.
    * @param a Es de tipo float.
    */
    public void setA(float a) {
        this.a = a;
    }
    /**
    * Getter retorna el lado b del triangulo.
     * @return b, es de tipo float.
    */
    public float getB() {
        return b;
    }
    /**
    * Setter que nos informa el lado b del triangulo.
     * @param b Es de tipo float.
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
    * Getter que nos devuelve el valor de lado c del triangulo.
    * @return c Es de tipo float.
    */
    public float getC() {
        return c;
    }
    /**
    * Setter que nos da el valor del lado c del triangulo.
    * @param c Es de tipo float.
    */
    public void setC(float c) {
        this.c = c;
    }
    /**
    * Getter que regresa el valor de la base del triangulo.
    * @return base, de tipo float.
    */
    public float getBase() {
        return base;
    }
    /**
    * Setter que asigna el valor de la base del triangulo.
    * @param base Es de tipo float.
    */
    public void setBase(float base) {
        this.base = base;
    }
    /**
    * Getter que devuelve el valor de la altura del triangulo.
    * @return altura, es de tipo float.
    */
    public float getAltura() {
        return altura;
    }
    /**
    * Setter que asigna el valor de la altura del triangulo.
    * @param altura Es de tipo float.
    */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
    * Getter que retorna el valor de alpha, angulo del triangulo.
    * @return alfa, es de tipo int.
    */
    public int getAlfa() {
        return alfa;
    }
    /**
    * Setter que nos da la referencia del valor de alpha, angulo del triangulo.
    * @param alfa Es de tipo int.
    */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    /**
    * Getter nos indica el valor de beta, angulo del triangulo.
    * @return beta, es de tipo int.
    */
    public int getBeta() {
        return beta;
    }
    /**
    * Setter que nos indica el valor de beta, angulo del triangulo.
    * @param beta Es de tipo int.
    */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
    * Getter que nos da la informacion de gama, angulo del triangulo.
     * @return gamma, es de tipo int.
     */
    public int getGamma() {
        return gamma;
    }
    /**
    * Setter que da la informacion de gama, angulo del triangulo.
    * @param gamma Es de tipo int.
    */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    /**
     * Metodo toString nos da la informacion general del triangulo.
     * @return Informacion del triangulo, es de tipo String.
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + '}';
    }
    
    
}
