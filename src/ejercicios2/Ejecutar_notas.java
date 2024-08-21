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
public class Ejecutar_notas {
    public static void main (String[]args){
     double[]llenar= new double[15];
    Scanner input = new Scanner(System.in);
    Notas calculos = new Notas();
        System.out.println("Bienvenido a la clase de Algebra Lineal");
         System.out.println("ingrese el registro de notas de la evaluacion final");
        for(int i=0;i<llenar.length;i++){
        llenar[i]= input.nextDouble(); 
        calculos.Notas(llenar);
        }
    calculos.cal_notas();
     
    } 
}
