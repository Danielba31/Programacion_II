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
public class Contador {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int [] numero= new int[10];
    
        System.out.print("Ingrese 10 numeros:" );

    for (int i=0 ; i<numero.length; i++ ){
    numero[i] = input.nextInt();
    
  }   
    for (int i=0 ; i<numero.length; i++ ){
     if (numero[i] % 2 == 0){
       System.out.println(numero[i]+"Es un numero par" );
    }else
        
      System.out.println(numero[i]+"No es un numero " );
   }   
    
 }
}
