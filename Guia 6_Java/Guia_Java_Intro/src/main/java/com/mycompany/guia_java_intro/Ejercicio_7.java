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
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase=leer.next();
        if (frase.equals("eureka") ){
            System.out.println("La frase es correcta");
            
        }else
            System.out.println("Frase incorrecta");
    }
    
}
