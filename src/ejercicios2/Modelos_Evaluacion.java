/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Daniel Barrios
 */
public class Modelos_Evaluacion {//declaramos 2 arrays vacias las cuales se encargaran de llenar y mostrar los resultados y una llena
    int []U_Digito= new int[0];  //para que podamos hacer la condicional que dependiendo del numero se le muestre un espacio de la array modelo 
    String []Modelo= {"Modelo_1","Modelo_2","Modelo_3","Modelo_4","Modelo_5"};
    String []Tipo_Modelo;
    
    public void U_Digito(int []U_Digito){//metodo constructor que se encarga de llenar la array 
    this.U_Digito=U_Digito;
    this.Tipo_Modelo=new String[U_Digito.length];//le damos el mismo tamaño de nuestsra primera array a esta 
    }
    
    public void Comparar_Digito(){// se comparan las variables de ultimos digitos para saber que tipo de modelo es para cada estudiante
    for(int i=0; i<U_Digito.length;i++){//funcion for para las codicionales y el almacenamiento de los resultados 
       
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

    public String getTipo_Modelo(int i) {//retornamos las variable de tipo modelo 
        return Tipo_Modelo[i];
    }

    public int[] getU_Digito() {//retornamos la variable de ultimo digito
        return U_Digito;
    }
    
}
