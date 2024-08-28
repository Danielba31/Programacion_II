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
public class Promedio_programacionII {
    double promedio; 
    double suma;
    int estudiantes_arriba;
    int estudiantes_abajo;
    int canti;
    double []estudiantes_notas;
    
    public void suma(double suma){
    this.suma=suma;
    }
    
    public void canti(int canti){
    this.canti=canti;
    }
    
    public void estudiantes(double estudiantes[]){
    this.estudiantes_notas=estudiantes;
    }
    
    public void calcular_promedio(){
     promedio=suma/canti; 
     
     for(int i=0;i<estudiantes_notas.length;i++){
     if(estudiantes_notas[i]>=promedio){
     estudiantes_arriba++;
     }if(estudiantes_notas[i]<promedio){
     estudiantes_abajo++;
      }
     }
       
       
   }

    public double getPromedio() {
        return promedio;
    }

    public int getEstudiantes_arriba() {
        return estudiantes_arriba;
    }

    public int getEstudiantes_abajo() {
        return estudiantes_abajo;
    }

    public double[] getEstudiantes_notas() {
        return estudiantes_notas;
    }
    
    
}
