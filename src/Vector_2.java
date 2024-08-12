/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Barrios
 */
import java.util.Scanner;

public class Vector_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] repeticiones = new int[10];
        int suma = 0;

     System.out.println("*********************************");
     System.out.println("*Ingrese 10 numeros en su vector*");
     System.out.println("*********************************");
    
        // Ingresar los números en el vector
        for (int i = 0; i < numeros.length; i++) {
        
            numeros[i] = input.nextInt();
            suma += numeros[i];
            repeticiones[numeros[i]]++;
        }

        // Calcular promedio
        double promedio = (double) suma / numeros.length;

        // Mostrar la cantidad de repeticiones de cada número
        for (int i = 0; i < repeticiones.length; i++) {
            if (repeticiones[i] > 0) {
                System.out.println("El número " + i + " se ingresó " + repeticiones[i] + " veces.");
            }
        }

        System.out.println("El promedio de los números ingresados es: " + promedio);

        input.close();
    }
}


