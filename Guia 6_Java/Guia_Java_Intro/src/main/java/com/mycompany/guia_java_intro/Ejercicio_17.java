/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia_java_intro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Ejercicio_17 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int num=leer.nextInt();
        int[] vector=new int[num];
        for (int i=0;i<vector.length;i++){
            vector[i]=new Random().nextInt(10000);
        }
        for (int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
        int dig1=0,dig2=0,dig3=0,dig4=0,dig5=0;
        for (int i=0;i<vector.length;i++){
            if (vector[i]<9){
                dig1=dig1+1;
            }else if (vector[i]<99){
                dig2=dig2+1;
            }else if (vector[i]<999){
                dig3=dig3+1;
            }else if (vector[i]<9999){
                dig4=dig4+1;
            }else
                dig5=dig5+1;
            
        }
        System.out.println("Numeros de un digito: "+dig1);
        System.out.println("Numeros de dos digito: "+dig2);
        System.out.println("Numeros de tres digito: "+dig3);
        System.out.println("Numeros de cuatro digito: "+dig4);
        System.out.println("Numeros de cinco digito: "+dig5);
    
    }
}
