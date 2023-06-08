/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebatriangulo;

/**
 * @author Alberto
 */

/**
 * La clase `Triangulo` representa un triángulo con sus lados y proporciona métodos para calcular su perímetro y área.
 */
public class Triangulo {
    
    private double lado1;
    private double lado2;
    private double lado3;
    
     /**
     * Crea un objeto `Triangulo` con los lados especificados.
     *
     * @param lado1 longitud del lado 1 del triángulo
     * @param lado2 longitud del lado 2 del triángulo
     * @param lado3 longitud del lado 3 del triángulo
     */
    
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    /**
     * Obtiene la longitud del lado 1 del triángulo.
     *
     * @return longitud del lado 1
     */
    public double getLado1() {
        return lado1;
    }
   /**
     * Obtiene la longitud del lado 2 del triángulo.
     *
     * @return longitud del lado 2
     */ 
    public double getLado2() {
        return lado2;
    }
    /**
     * Obtiene la longitud del lado 3 del triángulo.
     *
     * @return longitud del lado 3
     */ 
    public double getLado3() {
        return lado3;
    }
    /**
     * Calcula el perímetro del triángulo.
     *
     * @return perímetro del triángulo
     */
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    /**
     * Calcula el área del triángulo utilizando la fórmula de Herón.
     *
     * @return área del triángulo
     */
    public double calcularArea() {
        // Utilizamos la fórmula de Herón para calcular el área
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}

