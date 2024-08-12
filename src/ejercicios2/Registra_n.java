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
public class Registra_n {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int Año=0;
    while(Año!=1){
        
     System.out.println("****************************************");
     System.out.println("*Bienvenido a la Registraduria Nacional*");
     System.out.println("****************************************");

     System.out.println("Por favor ingrese su año de nacimiento \n Ejemplo: ");
     
     System.out.println("******");
     System.out.println("*2005*\n*2003*\n*2006*");
     System.out.println("******");

     Año = input.nextInt();
     int Edad = 2024-Año;
     
    
    
     if (Año==1){
     System.out.println("*********************");
     System.out.println("*Programa Finalizado*");
     System.out.println("*********************");
     System.exit(0);
     }
     if (Edad>=18){
     System.out.println("Ud tiene "+Edad+" Años de Edad");
     System.out.println("Ud es acto para votar");
      }
    
     else{
     System.out.println("Ud tiene "+Edad+" Años de Edad");
     System.out.println("Ud No es acto para votar");
   }
  } 
 }
}