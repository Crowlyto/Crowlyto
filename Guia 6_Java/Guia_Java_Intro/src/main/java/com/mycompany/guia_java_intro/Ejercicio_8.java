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
public class Ejercicio_8 {

    /**
     * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
     * usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
     * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
     * Nota: investigar la función Lenght() en Java.
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres de largo");
        frase=leer.nextLine();
        if (frase.length()==8){
            System.out.println("CORRECTO");
        }else
            System.out.println("INCORRECTO");
               
    }
    
}
