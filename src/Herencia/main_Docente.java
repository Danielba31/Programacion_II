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
public class main_Docente {
    public static void main (String[] args){
      String nombre;
      String facultad;
      String cadi;
    Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a tu aplicacion de calculo de sueldo para docentes ");
        System.out.println("ingrese 1 si es un docente de tipo HC\ningrese 2 si es un docente de tipo TCO");
        int numero = input.nextInt();
        
        switch(numero) {
  case 1:
      input.nextLine();
      System.out.println("ingresa el nombre del docente: ");
      nombre = input.nextLine();
      System.out.println("ingresa la facultad del docente: ");
      facultad = input.nextLine();
      System.out.println("ingresa el cadi del docente: ");
      cadi= input.nextLine();
      Docente_Hc dhc = new Docente_Hc(nombre,facultad,cadi);
      System.out.println("ahora calcularemos el sueldo del docente "+nombre);
      System.out.println("dame el numero de horas trabajadas por el docente "+nombre);
      int horas_t= input.nextInt();
      dhc.numero_H(horas_t);
      dhc.calcular_sueldo();
      
    break;
  case 2:
      input.nextLine();
   System.out.println("ingresa el nombre del docente: ");
      nombre = input.nextLine();
      System.out.println("ingresa la facultad del docente: ");
      facultad = input.nextLine();
      System.out.println("ingresa el cadi del docente: ");
      cadi= input.nextLine();
      Docente_Tco dtco = new Docente_Tco(nombre,facultad,cadi);
      System.out.println("ahora calcularemos el sueldo del docente "+nombre);
      System.out.println("indica en cuantos trabajos de grado participo del docente "+nombre);
      int t_grado = input.nextInt();
      dtco.trabajos_grado(t_grado);
      System.out.println("su sueldo fija es de: "+dtco.getSueldo_f());
      System.out.println("las horas extras que trabajo del docente son de: "+dtco.getHoras_extras());
      dtco.calcular_sueldotco();
}
    
    
    
    }
}
