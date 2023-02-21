package com.mycompany.herencia_2;

import com.mycompany.herencia_2.entidades.Lavadora;
import com.mycompany.herencia_2.entidades.Televisor;
import com.mycompany.herencia_2.serrvicio.Servicio;

public class Herencia_2 {

    public static void main(String[] args) {
//      Lavadora one=new Lavadora();
//      one.crearLavadora();
//      System.out.println(one);
//      Televisor two=new Televisor();
//      two.crearTelevisor();
        Servicio serv = new Servicio();
        serv.crearArray();
        serv.mostrarArray();

    }
}

