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
public class Ejecutar_Modelo {//clase principal
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);//creamos un objeto tipo scanner 
    Modelos_Evaluacion obj = new Modelos_Evaluacion();//creamos el objeto de nuestra otra clase 
    
        System.out.println("digite cuantos estudiantes va a ingresar: ");//le pedimos al usuario la cantidad de estudiantes 
        int cantidad_e = input.nextInt();
        
        int []llenar = new int[cantidad_e];//se declara una array con el tamaño de la cantidad de estudiantes 
        System.out.println("ingrese el ultimo numero de documento de cada estudiante: ");//le pedimos al usuario que digite el ultimo digito de su documento 
        for(int i=0;i<llenar.length;i++){//funcion for que se encarga de leer y guardar cada numero 
        llenar[i]= input.nextInt();
        }
        obj.U_Digito(llenar);//llamamos al objeto que habiamos creado con la funcion U_Digito y le asignamos la array llenar 
        obj.Comparar_Digito();//llamamos un objeto con la funcion comparar digito para que haga las operaciones correspondientes 
        for(int i =1;i<=cantidad_e;i++){//for que se encarga de mostrar los estudiantes con su numero de documento y el tipo de modelo que deben presentar 
           
        System.out.println("el modelo del estudiante: "+i+ " con numero de documento: "+llenar[i-1]+" es: "+ obj.getTipo_Modelo(i-1));
    
    }
    }
    
    
}
