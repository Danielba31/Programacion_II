/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Daniel Barrios
 */
public class Docente {
    private String Nombre_D;
    private String Facultad;
    private String Cadi;

    public Docente(String Nombre_D, String Facultad, String Cadi) {
        this.Nombre_D = Nombre_D;
        this.Facultad = Facultad;
        this.Cadi = Cadi;
    }

    public String getNombre_D() {
        return Nombre_D;
    }

    public String getFacultad() {
        return Facultad;
    }

    public String getCadi() {
        return Cadi;
    }
    
    
}
