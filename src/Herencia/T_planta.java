/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Daniel Barrios
 */
public  class T_planta extends Trabajadores {
    double salud,pension;
    int salario_t;
    public T_planta(int codig_t, String Nombre, String Apellido, Long telefono, Long salario){
    super(codig_t,Nombre,Apellido,telefono,salario);
    }

    public void calcular_s(){
    salud=salario*0.04;
     salario_t=(int) (salario-salud);
     pension=salario*0.08;
     salario_t=(int)(salario_t-pension);
    }
    
    
    @Override
    public void mostrardatos() {
        System.out.println("Hola "+Nombre+" "+Apellido+"\ntu salario mensual fijo es de : "+salario);
        System.out.println("tu descuento de salud es de: "+salud+"\ntu descuento de pension es de: "+pension);
        System.out.println("para un salario total de: "+salario_t);
        System.out.println("cualquier inconveniente que tengamos t comunicaremos al "+telefono);

    }
    
    
}
