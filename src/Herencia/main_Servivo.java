/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Daniel Barrios
 */
public class main_Servivo {
    public static void main (String[] args){
    Planta planta = new Planta();
    Animal_carnivoro animalc = new Animal_carnivoro();
    Animal_herbivoro animalh = new Animal_herbivoro();
    
    planta.alimentarse();
    animalc.alimentarse();
    animalh.alimentarse();
    }
}
