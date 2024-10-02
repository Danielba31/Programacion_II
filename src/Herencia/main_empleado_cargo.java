/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Daniel Barrios
 */
import java.util.Scanner;
public class main_empleado_cargo {
    public static void main (String[]args){
    Cargo cargo1 = new Cargo("secretario",1000000,"25");
    Municipio municipio1 = new Municipio("fusagasuga","31");
    Empleados empleado1 = new Empleados("Daniel","Barrios","31",cargo1,municipio1 ){};
    
        System.out.println("el cargo de "+cargo1.getCargo()+" con salario de "+cargo1.getSalario()+" y codigo de "+cargo1.getCodigo());
        System.out.println("del municipio de "+municipio1.getMunicipio()+" codigo "+municipio1.getCodigo());
        System.out.println("es del empleado "+empleado1.getNombre()+" "+empleado1.getApellido()+" codigo "+empleado1.getCodigo());
        System.out.println(empleado1);
    
    }
}
