/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Daniel Barrios
 */
public class Profesores extends Persona{

    public int getSalario() {
        return Salario;
    }
    
    protected int Salario;

    public Profesores(int cedula, int edad, int telefono, String nombre, int Salario) {
       super(cedula,edad,telefono,nombre);       
        this.Salario = Salario;
    }
    
}
