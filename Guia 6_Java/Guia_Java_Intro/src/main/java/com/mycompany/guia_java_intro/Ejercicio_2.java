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
public class Ejercicio_2 {

    /**
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
     * pantalla.
     */
    public static void main(String[] args) {
        String nombre;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
        System.out.println("Su nombre es: "+nombre);
    }
    
}
