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
public class Ejercicio_4 {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
     * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        double centi,faren;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados que desea convertir");
        centi=leer.nextDouble();
        faren=(1.8*centi+32);
        System.out.println("El resultado de la conversion es: "+faren+ " Fahrenheit");
        
    }
    
}
