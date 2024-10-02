/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Daniel Barrios
 */
public abstract class Empleados {
    protected String nombre;
    protected String apellido;
    protected String codigo;

   public Cargo encargo;
   public Municipio enmunicipio;

    public Empleados(String nombre, String apellido, String codigo, Cargo encargo, Municipio enmunicipio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.encargo = encargo;
        this.enmunicipio = enmunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cargo getCargo() {
        return encargo;
    }

    public void setCargo(Cargo cargo) {
        this.encargo = cargo;
    }

    public Municipio getMunicipio() {
        return enmunicipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.enmunicipio = municipio;
    }
    
   
    }
    




