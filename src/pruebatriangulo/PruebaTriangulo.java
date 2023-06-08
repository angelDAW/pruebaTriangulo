/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebatriangulo;

/**
 *
 * @author Alberto
 */


/**
 * La clase `PruebaTriangulo` contiene el método `main` donde se realizan pruebas con la clase `Triangulo`.
 */
public class PruebaTriangulo {
    
    /**
     * Punto de entrada principal para ejecutar las pruebas con la clase `Triangulo`.
     *
     * @param args argumentos de línea de comandos (no utilizados en este caso)
     */
    public static void main(String[] args) {
        // Crear objetos Triangulo
        Triangulo triangulo1 = new Triangulo(1, 3, 5);
        Triangulo triangulo2 = new Triangulo(5, 5, 5);
        
        // Obtener los lados de los triángulos
        double lado1Triangulo1 = triangulo1.getLado1();
        double lado2Triangulo1 = triangulo1.getLado2();
        double lado3Triangulo1 = triangulo1.getLado3();
        
        double lado1Triangulo2 = triangulo2.getLado1();
        double lado2Triangulo2 = triangulo2.getLado2();
        double lado3Triangulo2 = triangulo2.getLado3();
        
        // Calcular el perímetro de los triángulos
        double perimetroTriangulo1 = triangulo1.calcularPerimetro();
        double perimetroTriangulo2 = triangulo2.calcularPerimetro();
        
        // Calcular el área de los triángulos
        double areaTriangulo1 = triangulo1.calcularArea();
        double areaTriangulo2 = triangulo2.calcularArea();
        
        // Imprimir los resultados
        System.out.println("Triangulo 1:");
        System.out.println("Lado 1: " + lado1Triangulo1);
        System.out.println("Lado 2: " + lado2Triangulo1);
        System.out.println("Lado 3: " + lado3Triangulo1);
        System.out.println("Perimetro: " + perimetroTriangulo1);
        System.out.println("Area: " + areaTriangulo1);
        
        System.out.println();
        
        System.out.println("Triangulo 2:");
        System.out.println("Lado 1: " + lado1Triangulo2);
        System.out.println("Lado 2: " + lado2Triangulo2);
        System.out.println("Lado 3: " + lado3Triangulo2);
        System.out.println("Perimetro: " + perimetroTriangulo2);
        System.out.println("Area: " + areaTriangulo2);
    }
}

