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
    
    double [] estaturas = new double[25];
   
    int posicion_a;
    int posicion_b;
    
    
    public void estaturas(double []estaturas){
    this.estaturas=estaturas;
    }
    
    
    public void calculo_e(){
        double E_malta= estaturas[0];
    double E_mbaja=estaturas[0];
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
