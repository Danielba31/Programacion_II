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
public class Ejecutar_srm {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int [] Cantidad= new int [2];
        Suma_resta_multi calculo =new Suma_resta_multi ();
        System.out.println("Ingrese 2 numeros para operar: ");
        for(int i=0;i<Cantidad.length;i++){
        Cantidad[i]= input.nextInt();
        }
        
      calculo.T_numeros(Cantidad);
      calculo.cal_S();
      System.err.println("");
      calculo.cal_R();
      System.err.println("");
      calculo.cal_M();
 }
}
