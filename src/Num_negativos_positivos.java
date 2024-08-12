/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Barrios
 */
import java.util.Scanner;
public class Num_negativos_positivos {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    int [] tamaño = new int [6];
    
    System.out.println("ingrese 6 numeros enteros:\n positivos\n negativos ");
    for(int i=0; i<tamaño.length;i++){
     tamaño[i]=input.nextInt();
  }
    for(int i =0; i<tamaño.length;i++){
      if(tamaño[i]>0){
      System.out.println(tamaño[i] +" es positivo" );
      
      }else if(tamaño[i]==0){
             System.out.println(tamaño[i] +" es un cero " );

      }else{
            System.out.println(tamaño[i] +" es negativo" );

      }
    
    }
 }
}
