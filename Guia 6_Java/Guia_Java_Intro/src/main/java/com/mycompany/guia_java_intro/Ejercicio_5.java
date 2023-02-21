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
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular");
        double num=leer.nextDouble();
        System.out.println("El doble del numero es: "+(num*2));
        System.out.println("El triple del numero es: "+(num*3));
        System.out.println("La razi del numero es: "+(Math.sqrt(num)));
        
    }
    
}
