/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Daniel Barrios
 */
public class Estudiantes extends Persona {
    
   private int codigo;
    
   public Estudiantes (long cedula, int edad, long telefono, String nombre, int codigo){
       super(cedula,edad,telefono,nombre);
       this.codigo=codigo;
   }

    public int getCodigo() {
        return codigo;
    }
    public void mostrar_datos (){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Cedula: "+getCedula());
        System.out.println("Telefono: "+getTelefono());
        System.out.println("Codigo: "+codigo);
    }
}
