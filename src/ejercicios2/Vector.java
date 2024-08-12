/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Daniel Barrios
 */
import java.util.Scanner;
public class Vector {
    public static void main (String[] args){
    Scanner input = new Scanner (System.in);  
    int [] Vector = new int [10];
    int [] Rep = new int [10];
    int [] t_rep;
    
     System.out.println("*********************************");
     System.out.println("*Ingrese 10 numeros en su vector*");
     System.out.println("*********************************");
    
     for (int i=0 ; i<Vector.length; i++ ){
      Vector[i] = input.nextInt();
      Rep[i]=0;
    }
     for (int i=0 ; i<Vector.length; i++){
      for(int j = 0; j<Vector.length;j++){
       if(Vector[i]==Vector[j]){
        Rep[i]++;
       }
      }
     }
  
    
     for (int i=0; i<Vector.length; i++){
       if(Rep[i]>0){
       System.out.println("el numero "+Vector[i]+" se repite "+Rep[i]);
       }
     
     }
 }   
}
