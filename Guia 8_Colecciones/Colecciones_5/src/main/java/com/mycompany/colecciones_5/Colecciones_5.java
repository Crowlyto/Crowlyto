/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.colecciones_5;

import com.mycompany.colecciones_5.Atributos.Paises;
import java.util.*;

/**
 *
 * @author crowl
 */
public class Colecciones_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Set<Paises> pais = new TreeSet();
        Paises two;
        String nombre, termina = "";
        System.out.println("VAMOS A INGRESAR NOMBRES DE PAISES\n=============================");
        do {
            two=new Paises();
            System.out.println("Ingrese un nombre");
            nombre = leer.next();
            two.setPais(nombre);
            pais.add(two);
            System.out.println("Desea ingresar otro nombre? S/N");
            termina = leer.next();
        } while (termina.equalsIgnoreCase("S"));
        for (Paises pai : pais) {
            System.out.println(pai); 
        } 
    
//        System.out.println("===============");
//        for (String pai : pais) {
//            System.out.println(pai);
        
        System.out.println("===============");
        termina = "";
        do {
            System.out.println("Ingrese un Pais a eliminar");
            nombre = leer.next();
            two=new Paises();
            two.setPais(nombre);
            for (int i = 0; i < pais.size(); i++) {
                if (pais.contains(two)){
                    pais.remove(two);
                }
            }
            System.out.println("Desea ingresar otro nombre? S/N");
            termina = leer.next();
        } while (termina.equalsIgnoreCase("S"));
     for (Paises pai : pais) {
            System.out.println(pai); 
        } 

}
}
