/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.relaciones;

import com.relaciones.entidades.Perro;
import com.relaciones.entidades.Persona;

/**
 *
 * @author crowl
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        
        Perro one=new Perro("Leandro", "Callejero Aleman", 7, "Gordo");
        Perro two= new Perro("Fernando","Beagle",2, "Chiquito");
        Persona uno=new Persona("Ulises", "Gadea", 18, 12123123, one);
        Persona dos=new Persona ("Fancisca","San Martin", 23, 32321321,two);
        
        System.out.println(uno);
        System.out.println(dos);
    }
}
