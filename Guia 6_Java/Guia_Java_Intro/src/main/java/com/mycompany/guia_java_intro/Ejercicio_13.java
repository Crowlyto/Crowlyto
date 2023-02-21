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
public class Ejercicio_13 {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
     * cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado a dibujar");
        int lado=leer.nextInt();
        for (int i=1;i<lado;i++){
            System.out.print("* ");
        }
        System.out.println("*");
        for (int j=1;j<lado;j++){
            System.out.print("* ");
            for (int k=1;k<=lado;k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int l=1;l<lado;l++){
            System.out.print("* ");
        }
        System.out.println("*");
    }
    
}
