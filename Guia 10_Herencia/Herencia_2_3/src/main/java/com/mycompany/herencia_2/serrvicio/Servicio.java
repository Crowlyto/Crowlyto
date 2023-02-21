
package com.mycompany.herencia_2.serrvicio;

import com.mycompany.herencia_2.entidades.Electrodomestico;
import com.mycompany.herencia_2.entidades.Lavadora;
import com.mycompany.herencia_2.entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Servicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    ArrayList<Electrodomestico> elect=new ArrayList();
  
    public void crearArray(){
        
        String OP="";
        do{
        System.out.println("Que electrodomestico desea cargar\n"
                + "--------------------");
        System.out.println("1- LAVADORA\n"
                + "2- TELEVISOR\n"
                + "--------------------");
        int opc=leer.nextInt();
        if (opc==1){
            Lavadora lav=new Lavadora();
            lav.crearLavadora();
            elect.add(lav);
        }else{
            Televisor tc=new Televisor();
            tc.crearTelevisor();
            elect.add(tc);
        }
            System.out.println("Desea ingresar otro Electrodomestico? S/N");
            OP=leer.next();
        }while(OP.equalsIgnoreCase("S"));
        
    }
    public void mostrarArray(){
        double precio=0;
        double precio1=0;
        double precio2=0;
        for (Electrodomestico aux1 : elect) {
            if (aux1 instanceof Lavadora){
                 precio+=aux1.getPrecio();
                 precio1+=aux1.getPrecio();
            }
            if(aux1 instanceof Televisor){
                precio+=aux1.getPrecio();
                precio2+=aux1.getPrecio();
            }
            
        }
        System.out.println("Preci total de lavadoras: "+precio1);
        System.out.println("Precio total de televisores: "+precio2);
        System.out.println("Precio total de productos: "+ precio);
        
    }
     
      
    
     
     
    

   
        
}
