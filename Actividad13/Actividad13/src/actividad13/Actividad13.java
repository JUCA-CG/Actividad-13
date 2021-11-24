/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author jc_ca
 */
//Ánonima
interface AnonClass {
    public void anonMethod();
}
//Lambda
interface Lambda {
    ArrayList<String> make(String val, String vald);
}

//Método de referencia
interface MetodosDeReferencia{
    String make(String val, String vald);
}
// calse de acomodo para Método de referencia
class Acomodo {

    static ArrayList<String> cadenas = new ArrayList<String>();
    // De manera alfabetica Método de referencia
    static String alfabetico(String val,String vald) {
        ArrayList<String> cadenas = new ArrayList<String>();
        String [] valores ={"Programación","Java","Orientada","Objetos","Universidad","Cine","Coche","Pista","Avenida","Banco"};
       for(int i = 0; i<valores.length;i++){
          cadenas.add(valores[i]); 
       }
        System.out.println("--------------------------Acomodo por orden alfabético-por método de referencia-------------------");
       Collections.sort(cadenas);
   
    for (String val2: cadenas) {
        System.out.println(val2);
        
    }
        String val2="";
        return val2;
       
    }
    // Por longitud Método de referencia
    static String longitud(String val,String vald) {
         ArrayList<String> cadenas = new ArrayList<String>();
        String [] valores ={"Programación","Java","Orientada","Objetos","Universidad","Cine","Coche","Pista","Avenida","Banco"};
       for(int i = 0; i<valores.length;i++){
          cadenas.add(valores[i]); 
       }
         System.out.println("-----------------------Acomodo por longitud de palabra -por método de referencia--------------------------");
    cadenas.sort(Comparator.comparing(String::length).thenComparing(String::compareTo)); 
      for (String vald2: cadenas) {
        System.out.println(vald2);
    }
            
         String val2="";
        return val2;
        
    }

 
      
    }

public class Actividad13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<String>();
        String [] valores ={"Programación","Java","Orientada","Objetos","Universidad","Cine","Coche","Pista","Avenida","Banco"};
       for(int i = 0; i<valores.length;i++){
          cadenas.add(valores[i]); 
       }
       /*Iterator<String> nombreIterator = cadenas.iterator();
       int v = 0;
while(nombreIterator.hasNext()){
    v=v+1;
	String elemento = nombreIterator.next();
	System.out.println(v+"-"+elemento);      
    }*/
       //Clase anónima
        AnonClass anon = new AnonClass() {
            public void anonMethod() {
                System.out.println("--------------------------Acomodo por orden alfabético-por clase anónoima-------------------");
       Collections.sort(cadenas);
   
    for (String val: cadenas) {
        System.out.println(val);
    }
    System.out.println("-----------------------Acomodo por longitud de palabra -por clase anónoima--------------------------");
    cadenas.sort(Comparator.comparing(String::length).thenComparing(String::compareTo)); 
      for (String vald: cadenas) {
        System.out.println(vald);
    }
            }
        };

        anon.anonMethod();
  

//Lambda
Lambda gcd = (v,vd) -> {
            System.out.println("--------------------------Acomodo por orden alfabético-por lambda-------------------");
       Collections.sort(cadenas);
   
    for (String val: cadenas) {
        System.out.println(val);
        
    }
    
    System.out.println("-----------------------Acomodo por longitud de palabra -por lambda--------------------------");
    cadenas.sort(Comparator.comparing(String::length).thenComparing(String::compareTo)); 
      for (String vald: cadenas) {
        System.out.println(vald);
    }
            
         
            
            return cadenas;
        };
        String val ="";
        String vald = "";
       gcd.make(val,vald);
        
       
       
       
      //Método de referencia

        MetodosDeReferencia  alfabetico = Acomodo:: alfabetico;
        MetodosDeReferencia longitud = Acomodo::longitud;
       

        System.out.println(alfabetico.make(val,vald));
        System.out.println( longitud.make(val,vald));
      

    }

    
 }

      
       
      

   
     
   

