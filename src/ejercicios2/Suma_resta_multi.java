/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Daniel Barrios
 */
public class Suma_resta_multi {
    int suma ;
    int resta;
    int multi;
    int [] T_numeros = new int [2];
    
    public void T_numeros(int T_numeros []){
    this.T_numeros=T_numeros;
    }
    
    public void cal_S (){
    for(int i=0;i<T_numeros.length;i++){
     int numero = T_numeros[i];
     suma +=numero;
     
    }
    System.out.println(T_numeros[0]+" + "+T_numeros[1]+" = "+suma);
    }
    
    public void cal_R(){
       
    
     resta = T_numeros[0] - T_numeros[1];
     
    
    System.out.println(T_numeros[0]+" - "+T_numeros[1]+" = "+resta);
    }
    
    public void cal_M (){
   
     multi =T_numeros[0]*T_numeros[1];
     
    
    System.out.println(T_numeros[0]+" * "+T_numeros[1]+" = "+multi);
    
    }
}