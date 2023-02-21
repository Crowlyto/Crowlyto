/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia_java_intro;

import java.util.Scanner;

/**
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 *dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,num1,suma;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer valor a sumar");
        num=leer.nextInt();
        System.out.println("Ingrese el segundo valor a sumar");
        num1=leer.nextInt();
        suma=num+num1;
        System.out.println("La suma de los numeros es de "+suma);
        
    }
    
}
