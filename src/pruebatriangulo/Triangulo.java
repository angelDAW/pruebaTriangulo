/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebatriangulo;

/**
 * @author Alberto
 */
public class Triangulo {
    
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double getLado1() {
        return lado1;
    }
    
    public double getLado2() {
        return lado2;
    }
    
    public double getLado3() {
        return lado3;
    }
    
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    public double calcularArea() {
        // Utilizamos la fórmula de Herón para calcular el área
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}

