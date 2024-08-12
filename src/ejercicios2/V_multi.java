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
public class V_multi {
 public static void main (String[] args){
 Scanner input = new Scanner(System.in);
 double[][] notas = {{3.2, 3.5, 4.0},{4.1, 4.0, 4.2},{3.5, 3.5, 3.5},{4.0, 4.0, 4.0},{3.0, 3.0, 3.0}} ;
 double [][]nota2 ;
 int filas;
 int colum;
 double sumaf,suma1,prom1,promf;
 System.out.println("***********************************");
 System.out.println("*Bienvenido a al registro de notas*");
 System.out.println("***********************************");
    
  for (int i=0;i<5;i++){//numero de filas
   for (int j=0;j<3;j++){//numero de columnas 
       System.out.print(notas[i][j]);
   }
   System.out.println();
  }
  
   for (int i=0;i<5;i++){
         suma1 = 0;
   for (int j=0;j<3;j++){//numero de columnas 
       suma1 += notas[i][j];
   }
   prom1 = suma1/3;
   System.out.println("la suma de la fila ["+i+"] es: ["+suma1+"]");
   System.out.println("el promedio de la fila ["+i+"] es: ["+prom1+"]");
  }
  
 System.out.println("*****************************************");
 System.out.println("*Ingresa el tamaño de filas de tu matriz*");
 System.out.println("*****************************************");
   filas = input.nextInt();
 System.out.println("********************************************");
 System.out.println("*Ingresa el tamaño de columnas de tu matriz*");
 System.out.println("********************************************");
   colum = input.nextInt();
   
   nota2 = new double[filas][colum];
   
   
 System.out.println("*******************************");
 System.out.println("*Ingresa los datos de tu matriz*");
 System.out.println("*******************************");
   
    for (int i=0;i<filas;i++){//numero de filas
   for (int j=0;j<colum;j++){//numero de columnas 
       System.out.print("Matriz [" +i+ "] ["+j+"]");
       nota2[i][j] = input.nextDouble();
   
   }
   System.out.println();
  }
    for (int i=0;i<filas;i++){//numero de filas
   for (int j=0;j<colum;j++){//numero de columnas 
       System.out.print(nota2[i][j]);
   }
   System.out.println();
  }
     for (int i=0;i<filas;i++){
         sumaf = 0;
   for (int j=0;j<colum;j++){//numero de columnas 
       sumaf += nota2[i][j];
   }
   promf = sumaf/colum;
   System.out.println("la suma de la fila ["+i+"] es: ["+sumaf+"]");
   System.out.println("el promedio de la fila ["+i+"] es: ["+promf+"]");

  }
 }   
}
