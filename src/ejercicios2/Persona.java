/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Daniel Barrios
 */
public class Persona {
    
    private long cedula;
    private int edad;
    private long telefono;
    private String nombre;

    public Persona(long cedula, int edad, long telefono, String nombre) {
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

}
