/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ejercicios.rectangulo.vista;
import edu.ejercicios.rectangulo.modelo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class PruebaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        System.out.println("Cuantas veces desea probra el programa: ");
        int i=lectura.nextInt();
        for (int j=0;j<i;j++){
            System.out.println("Inserte base: ");
            double base=lectura.nextDouble();
            System.out.println("Inserte altura: ");
            double altura=lectura.nextDouble();
            Rectangulo R1 = new Rectangulo(base,altura);
            System.out.println("El area es: " + R1.calcularArea());
            System.out.println("El perimetro es: " + R1.calcularPerimetro());
        }
    }
    
}
