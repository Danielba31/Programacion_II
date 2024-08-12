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
    Scanner input = new Scanner (System.in);
    int num=0;
     System.out.println("Ingrese un numero entero ");
     Ceros cr = new Ceros();
     Negativos neg = new Negativos();
     Positivos pos = new Positivos();
        pos.num_P();    
        neg.num_N();
        cr.num_C();
    }
}
