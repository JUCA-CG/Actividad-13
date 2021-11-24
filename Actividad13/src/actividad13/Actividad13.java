/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad13;

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
interface Ordenar {
   String make(String val, String vald);
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
   Ordenar gcd = () -> {
        System.out.println("--------------------------Acomodo por orden alfabético-por clase anónoima-------------------");
       Collections.sort(cadenas);
   
    for (val: cadenas) {
        System.out.println(val);
    }
    System.out.println("-----------------------Acomodo por longitud de palabra -por clase anónoima--------------------------");
    cadenas.sort(Comparator.comparing(String::length).thenComparing(String::compareTo)); 
      for ( vald: cadenas) {
        System.out.println(vald);
    }
            return null;
            }
        };
        
        return null;
        ;
      

    }
     
   

