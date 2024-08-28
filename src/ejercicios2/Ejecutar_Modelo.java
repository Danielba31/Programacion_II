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
public class Ejecutar_Modelo {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    Modelos_Evaluacion obj = new Modelos_Evaluacion();
    
        System.out.println("digite cuantos estudiantes va a ingresar: ");
        int cantidad_e = input.nextInt();
        
        int []llenar = new int[cantidad_e];
        System.out.println("ingrese el ultimo numero de documento de cada estudiante: ");
        for(int i=0;i<llenar.length;i++){
        llenar[i]= input.nextInt();
        }
        obj.U_Digito(llenar);
        obj.Comparar_Digito();
        for(int i =1;i<=cantidad_e;i++){
           
        System.out.println("el modelo del estudiante: "+i+ " con numero de: "+llenar[i-1]+" es: "+ obj.getTipo_Modelo(i-1));
    
    }
    }
    
    
}
