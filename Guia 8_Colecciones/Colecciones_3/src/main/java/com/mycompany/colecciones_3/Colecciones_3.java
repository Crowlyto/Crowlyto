/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.colecciones_3;

import com.mycompany.colecciones_3.Atributos.Alumnos;
import com.mycompany.colecciones_3.Servicios.Servicios;

import java.util.*;

/**
 *
 * @author crowl
 */
public class Colecciones_3 {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        Servicios serv=new Servicios();
        String finalizar="";
        Alumnos oneAlum=new Alumnos();
        do{
            serv.ingresoDatos();
            System.out.println("Quiere ingresar otro alumno? S/N");
            finalizar=leer.next();
        }while (finalizar.equalsIgnoreCase("s"));
//        System.out.println("=========================");
//        System.out.println("Vamos a calcular la nota final\n=========================");
//        finalizar="";
//        do{
//            oneAlum=serv.encontrar();
//            System.out.println("Quiere buscar otro alumno? S/N");
//            finalizar=leer.next();
//        }while(finalizar.equalsIgnoreCase("s"));
//        System.out.println("=========================");
        serv.notaFinal();
        serv.mostar();
    }
}
