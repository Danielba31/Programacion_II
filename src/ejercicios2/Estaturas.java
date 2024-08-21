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
public class Estaturas {
    
    double [] estaturas ={1.70,1.65,1.69,1.71,1.67,1.68,1.66,1.77,1.75,1.79,1.74,1.83,1.80,1.63,1.64,1.72,1.73,1.74,1.75,1.75,1.76};
    double E_malta= estaturas[0];
    double E_mbaja=estaturas[0];
    int posicion_a;
    int posicion_b;
    
    public void calculo_e(){
    for(int i=0;i<estaturas.length;i++){
    if(E_malta<estaturas[i]){
     E_malta=estaturas[i];
     posicion_a=i;
        }
    if(E_mbaja>estaturas[i]){
    E_mbaja=estaturas[i];
    posicion_b=i;
    }
    
       }
    
        System.out.println("la estatura mas alta de curso es: "+E_malta+" en la posicion: "+posicion_a);
        System.out.println("la estatura mas baja del curso es: "+E_mbaja+" en la posicion: "+posicion_b);
           
    }
    
    public void mostrar_e(){
        System.out.println(Arrays.toString(estaturas));
    }
    
}
