/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Daniel Barrios
 */
public class Positivos {
    int[] tamaño =new int[10];
    int positivos ;
    int negativos;
    int ceros; 
    
    
    public void tamaño(int tamaño[]){
    this.tamaño=tamaño;
    }
    
     public void num_P(){
         
         
         
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
