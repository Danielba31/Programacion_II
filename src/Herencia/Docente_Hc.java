/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Daniel Barrios
 */
public class Docente_Hc extends Docente {
    private int horas_t;

    public Docente_Hc(String Nombre_D, String Facultad, String Cadi ) {
        super(Nombre_D, Facultad, Cadi);
        
    }
  public void numero_H(int horas_t){
    this.horas_t=horas_t;
    }
    public int getHoras_t() {
        return horas_t;
    }
   
    protected int valor_h = 8300;

  
    public void calcular_sueldo(){
    int sueldo_hc =valor_h*horas_t;
        System.out.println("el sueldo del docente "+getNombre_D()+" de la facultad de "+getFacultad()+" del cadi de "+getCadi());
        System.out.println("es de: "+sueldo_hc);
    }
}
