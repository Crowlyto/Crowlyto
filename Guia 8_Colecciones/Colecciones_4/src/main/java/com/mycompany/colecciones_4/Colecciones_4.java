/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.colecciones_4;

import java.util.*;
import static java.util.Collections.list;

/**
 *
 * @author crowl
 */
public class Colecciones_4 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Servicio serv=new Servicio();
        Pelicula pel=new Pelicula();
        String opcion="";
        do{
            serv.ingresoDatos();
            System.out.println("Desea agregar otra pelicula? S/N");
            opcion=leer.next();
        }while (opcion.equalsIgnoreCase("S"));
        System.out.println("=========================");
        serv.mostaraTodas();
        System.out.println("Peliculas con una duración mayor a 1 HS\n==========================");
        serv.mostrarHora();
        System.out.println("Peliculas Ordenadas por HS Descendente\n==========================");
        serv.ordenDes();
        System.out.println("Peliculas Ordenadas por HS Ascendente\n==========================");
        serv.ordenAsc();
        System.out.println("Peliculas Ordenadas por Titulo Alfabeticamente\n==========================");
        serv.ordenTitutlo();
        System.out.println("Peliculas Ordenadas por Director Alfabeticamente\n==========================");
        serv.ordenDirector();
    }
}
