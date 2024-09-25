/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Daniel Barrios
 */
public abstract class Trabajadores {
    int codig_t;
    String Nombre,Apellido;
    Long telefono,salario;

    public Trabajadores(int codig_t, String Nombre, String Apellido, Long telefono, Long salario) {
        this.codig_t = codig_t;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.telefono = telefono;
        this.salario = salario;
    }
    public abstract void mostrardatos();
    public abstract void calcular_s();
    
    
}
