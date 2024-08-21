/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Daniel Barrios
 */
import java.util.*;
public class p_enteros {
    public static void main(String[]args){
    int [] llenar = new int[10];
    Scanner input = new Scanner (System.in);
    Positivos cal = new Positivos();
     System.out.println("Ingrese 10 numeros entero ");
     for(int i=0; i<llenar.length;i++){
     llenar[i]=input.nextInt();
  }
     cal.tamaño(llenar);
     
     cal.num_P();    }
    
    
}
