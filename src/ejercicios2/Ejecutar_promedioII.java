/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Daniel Barrios
 */
import java.util.Arrays;
import java.util.Scanner;
public class Ejecutar_promedioII {
    public static void main(String[]args){
        Promedio_programacionII obj = new Promedio_programacionII();
        Scanner input = new Scanner(System.in);
        int tamaño;
        double llenar_s=0;
        System.out.println("ingrese la cantidad de estudiantes: ");
        tamaño= input.nextInt();
        obj.canti(tamaño);
        double[] notas = new double[tamaño];
        System.out.println("ingrese las notas de cada estudiante");
        for(int i=0;i<notas.length;i++){
            notas[i]= input.nextDouble();
              double numeros= notas[i];
              llenar_s +=numeros;
        }
        obj.suma(llenar_s);
        obj.estudiantes(notas);
        obj.calcular_promedio();
       
        System.out.println(Arrays.toString(obj.getEstudiantes_notas()));
        System.out.println("El promedio de las notas es de: "+obj.getPromedio());
        System.out.println("la cantidad de estudiantes que estan por encima del promedio es de: "+obj.getEstudiantes_arriba());
        System.out.println("la cantidad de estudiantes que estan por debajo del promedio es de: "+obj.getEstudiantes_abajo());
    
    
  }
}
