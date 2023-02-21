/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia_java_intro;

import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Ejercicio_3 {

    /**
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
     * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     */
    public static void main(String[] args) {
        String frase, mayus, minus;
        Scanner leer=new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Ingrese una frase a convertir");
        frase=leer.next();
        mayus=frase.toUpperCase();
        minus=frase.toLowerCase();
        System.out.println("La frase en mayuscula quedaria: "+mayus);
        System.out.println("La frase en minuscula quedaria: "+minus);
    }
    
}
