/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extra_4.Servicios;

import com.mycompany.extra_4.Atributos.NIF;
import java.util.*;

/**
 *
 * @author crowl
 */
public class Servicios {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
   public NIF crearNif(){
       NIF one=new NIF();
       System.out.println("Ingrese el DNI");
       one.setDNI(leer.nextLong());
       String []vector= {"T" , "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",};
       double compro=one.getDNI()%23;
       int x=(int)compro;
       System.out.println(x);
       one.setNIF(vector[x]);
       return one;
   }
   public void mostrar(NIF one){
       System.out.println(one.getDNI()+"-"+one.getNIF());
   }
    
}
