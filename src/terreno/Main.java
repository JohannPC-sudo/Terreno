/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package terreno;

import java.util.Scanner;

/**
 *
 * @Johann Lopez
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Leer las dimensiones de los lados A, B y C
        System.out.print("Ingrese la dimension del lado A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese la dimension del lado B: ");
        double B = scanner.nextDouble();

        System.out.print("Ingrese la dimension del lado C: ");
        double C = scanner.nextDouble();

        // Calcular el área y el perímetro del terreno
        double areaTerreno = Terreno.calcularAreaTerreno(A, B, C);
        double perimetroTerreno = Terreno.calcularPerimetroTerreno(A, B, C);

        // Mostrar los resultados
        System.out.println("El area del terreno es: " + areaTerreno);
        System.out.println("El perimetro del terreno es: " + perimetroTerreno);
    }

    }
    

