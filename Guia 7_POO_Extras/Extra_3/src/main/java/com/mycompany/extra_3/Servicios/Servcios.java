/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extra_3.Servicios;

import com.mycompany.extra_3.Atributos.Raices;
import java.util.*;

/**
 *
 * @author crowl
 */
public class Servcios {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public Raices ingresoDatos(){
        Raices one=new Raices();
        System.out.println("Ingrese un valor para A");
        one.setA(leer.nextInt());
        System.out.println("Ingrese un valor para B");
        one.setB(leer.nextInt());
        System.out.println("Ingrese un valor para C");
        one.setC(leer.nextInt());
        return one;
    }
    public double getDiscriminante(Raices one){
        double discriminante=(Math.pow(one.getB(),2)-4*one.getA()*one.getC());
        //double discriminante =(one.getB()*one.getB())-4*one.getA()*one.getC();
        one.setDiscrim(discriminante);
        return discriminante;
    }
    public boolean tieneRaices(Raices one){
        boolean flag;
        flag=one.getDiscrim()>0;
        return flag;
    }
    public boolean tieneRaiz(Raices one){
        boolean flag;
        flag=one.getDiscrim()==0;
        return flag;
    }
    public void obtenerRaices(Raices one){
        double raiz, raiz1;
        if (tieneRaices(one)==true){
            raiz=(one.getB()-Math.sqrt(Math.pow(one.getB(),2)-4*one.getA()*one.getC()/(2*one.getA())));
            raiz1=(one.getB()+Math.sqrt(Math.pow(one.getB(),2)-4*one.getA()*one.getC()/(2*one.getA())));
            System.out.println("Las dos soluciones son: "+raiz+" y "+raiz1);
        }else
            System.out.println("No se puede aplicar este metodo");
    }
    public void ontenerRaiz(Raices one){
        double raiz;
        if (tieneRaiz(one)==true){
            raiz=-one.getB()/(2*one.getA());
        }else
            System.out.println("No se puede aplicar este metodo");
              
    }
    public void calcular(Raices one){
        double raiz1,raiz2,raiz;
        if (tieneRaices(one)==true){
            raiz1=(one.getB()-Math.sqrt(Math.pow(one.getB(),2)-4*one.getA()*one.getC()/(2*one.getA())));
            raiz2=(one.getB()+Math.sqrt(Math.pow(one.getB(),2)-4*one.getA()*one.getC()/(2*one.getA())));
            System.out.println("Las dos soluciones son: "+raiz1+" y "+raiz2);
        }else if(tieneRaiz(one)==true){
            raiz=-one.getB()/(2*one.getA());
            System.out.println("La solucion es: "+raiz);
        }else   
            System.out.println("No existe solucion");
    }
}
