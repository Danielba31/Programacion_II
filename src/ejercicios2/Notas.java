/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;
public class Notas {
    double N_mayor;
    double suma;
    double promedio;
    int aprobados;
    int posicion;
    double [] Notas = new double[15]  ;
   
    
    public void Notas(double Notas[]){
    this.Notas=Notas;
    }
    public void cal_notas(){
    double N_menor= Notas[0];
     for (int i =0;i<Notas.length;i++){
     suma+=Notas[i];
     
     if(Notas[i]>N_mayor){
       N_mayor=Notas[i];
     }
     if(Notas[i]<N_menor){
     N_menor=Notas[i];
     posicion=i;
     
     }
 
     if(Notas[i]>3.0){
     aprobados++;
       }
      }
     
     promedio= suma/Notas.length;
     double porcentaje =(double)aprobados/Notas.length*100;
    
     System.out.println("La mayor nota es: "+ N_mayor);
        System.out.println("El porcentaje de alumnos aprobados es: "+ porcentaje);
        System.out.println("El promedio de las notas es: "+promedio);
        System.out.println("La menor nota se encuentra en la posición: " + posicion);
    }
}
