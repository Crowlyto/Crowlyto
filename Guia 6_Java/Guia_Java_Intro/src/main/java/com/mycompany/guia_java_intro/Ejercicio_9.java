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
public class Ejercicio_9 {

    /**Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
     * 
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String frase=leer.next();
        if (frase.substring(0,1).equals("A")){
        System.out.println("CORRECTO");
    }else 
            System.out.println("INCORRECTO");
    }
    
}
