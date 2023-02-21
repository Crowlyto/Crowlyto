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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el numero a corroborar");
        num=leer.nextInt();
        if (num%2==0){
            System.out.println("El numero es Par");
        }else 
            System.out.println("El numero es Impar"); 
                
            
    }
    
}
