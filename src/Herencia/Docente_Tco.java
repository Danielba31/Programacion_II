/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Daniel Barrios
 */
public class Docente_Tco extends Docente {
    
    public Docente_Tco(String Nombre_D, String Facultad, String Cadi) {
        super(Nombre_D, Facultad, Cadi);
    }
    int sueldo_f=2000000;
    int t_grado;
    int horas_extras;
    int horas_extrast;
    public void trabajos_grado(int t_grado){
    this.t_grado=t_grado;
    horas_extras=t_grado*2;
     horas_extrast =horas_extras*8300;
    }

    public int getSueldo_f() {
        return sueldo_f;
    }

    public int getHoras_extras() {
        return horas_extras;
    }
    
    public void calcular_sueldotco(){
     int sueldo_t =sueldo_f+horas_extrast;
        System.out.println("el sueldo total del docente es de:  "+sueldo_t);
    }
    
}
