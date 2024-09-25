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
public class Ejecutor_t {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int codig_t,N_proyectos;
    String Nombre,Apellido;
    Long telefono,salario;
    
        System.out.println("Bienvenido al sistema de pago para trabajadores");
        System.out.println("digite el numero de empleados que desea ingresar");
        int nt = input.nextInt();
        Trabajadores[] empleados = new  Trabajadores[nt];
        for(int i=0;i<nt;i++){
        System.out.println("ingrese 1 si es un trabajador de tipo PLANTA\ningrese 2 si es un trabajador de tipo CONSULTOR");
        int numero= input.nextInt();
        
        switch(numero){
        
            case 1:
                System.out.println("ingrese el codigo del trabajador: ");
                codig_t=input.nextInt();
                input.nextLine();
                System.out.println("ingrese el Nombre del trabajador: ");
                Nombre=input.nextLine();
                System.out.println("ingrese el Apellido del trabajdor: ");
                Apellido=input.nextLine();
                System.out.println("ingrese numero de telefono del trabajador: ");
                telefono=input.nextLong();
                System.out.println("cual es el salario fijo del trabajador: ");
                salario=input.nextLong();
                T_planta planta = new T_planta(codig_t,Nombre,Apellido,telefono,salario);
                planta.calcular_s();
                planta.mostrardatos();
                
                break;
            case 2:
                System.out.println("ingrese el codigo del trabajador: ");
                codig_t=input.nextInt();
                input.nextLine();
                System.out.println("ingrese el Nombre del trabajador: ");
                Nombre=input.nextLine();
                System.out.println("ingrese el Apellido del trabajdor: ");
                Apellido=input.nextLine();
                System.out.println("ingrese numero de telefono del trabajador: ");
                telefono=input.nextLong();
                System.out.println("cual es el salario fijo del trabajador: ");
                salario=input.nextLong();
                System.out.println("ingrese la cantidad de proyectos analizados: ");
                N_proyectos=input.nextInt();
                T_consultores consultores = new T_consultores (codig_t,Nombre,Apellido,telefono,salario,N_proyectos);
                consultores.calcular_s();
                consultores.mostrardatos();
        
        
        
        
        }
        }
    
    
    }
}
