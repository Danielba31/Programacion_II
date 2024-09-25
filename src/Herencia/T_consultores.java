/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Daniel Barrios
 */
public class T_consultores extends Trabajadores {
    int N_proyectos,salario_t,salario_1;
    public T_consultores(int codig_t, String Nombre, String Apellido, Long telefono, Long salario, int N_proyectos){
    super(codig_t,Nombre,Apellido,telefono,salario);
       this.N_proyectos=N_proyectos;     ;
    }

    
    
    @Override
    public void calcular_s() {
       salario_1=N_proyectos*50000 ;
       salario_t=(int) (salario+salario_1);
    }
    
    @Override
    public void mostrardatos() {
        System.out.println("Hola "+Nombre+" "+Apellido+" tu salario fijo es de: "+salario);
        System.out.println("Analisaste "+N_proyectos+" proyectos");
        System.out.println("recuerda que cada proyecto analizado tiene un valor de 50000 ");
        System.out.println("el valor de tus proyectos analizados es de: "+salario_1);
        System.out.println("tu salario total es de: "+salario_t);
        System.out.println("cualquier inconveniente que tengamos te comunicaremos al "+telefono);
    }

    
}
