/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Daniel Barrios
 */
public class Modelos_Evaluacion {
    int []U_Digito= new int[0];
    String []Modelo= {"Modelo_1","Modelo_2","Modelo_3","Modelo_4","Modelo_5"};
    String []Tipo_Modelo;
    
    public void U_Digito(int []U_Digito){
    this.U_Digito=U_Digito;
    this.Tipo_Modelo=new String[U_Digito.length];
    }
    
    public void Comparar_Digito(){
    for(int i=0; i<U_Digito.length;i++){
       
    if(U_Digito[i] == 1 || U_Digito[i] == 6){
       Tipo_Modelo[i]=Modelo[0];
    }if(U_Digito[i] == 2|| U_Digito[i] == 7){
       Tipo_Modelo[i]=Modelo[1];
     }if(U_Digito[i] == 3|| U_Digito[i] == 8){
       Tipo_Modelo[i]=Modelo[2];
      }if(U_Digito[i] == 4|| U_Digito[i] == 9){
       Tipo_Modelo[i]=Modelo[3];
      }if(U_Digito[i] == 5|| U_Digito[i] == 0){
       Tipo_Modelo[i]=Modelo[4];
      }
   }
  }

    public String getTipo_Modelo(int i) {
        return Tipo_Modelo[i];
    }

    public int[] getU_Digito() {
        return U_Digito;
    }
    
}
