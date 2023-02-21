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
public class Ejercicio_10 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
     *números al usuario hasta que la suma de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el limite");
        int num=leer.nextInt();
        int suma=0, num1;
        while (suma<num){
            System.out.println("ingrese un valor a sumar");
            num1=leer.nextInt();
            suma=suma+num1;
        } 
        
    }
    
}
