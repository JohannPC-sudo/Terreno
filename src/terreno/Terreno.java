/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terreno;

/**
 *
 * @author Usuario
 */
public class Terreno {
    
    // Método para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;    
    }
    
        // Método para calcular la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    // Método para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Método para calcular el perímetro del terreno
    public static double calcularPerimetroTerreno(double A, double B, double C) {
        double hipotenusa = calcularHipotenusa(B, C);
        return A + B + C + hipotenusa;
    }

    // Método para calcular el área total del terreno
    public static double calcularAreaTerreno(double A, double B, double C) {
        double areaRectangulo = calcularAreaRectangulo(B, C);
        double areaTriangulo = calcularAreaTriangulo(A - C, B);
        return areaRectangulo + areaTriangulo;
    }
    
}
