/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia_java_intro;

import java.util.Random;

/**
 *
 * @author crowl
 */
public class Ejercicio_15 {

    /**
     * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
     * muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {
        int[]vector;
        //int aux=0;
        vector=new int[100];
        for (int i=0; i<vector.length; i++){
            vector[i]=new Random().nextInt(100);
        }
        for (int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
        System.out.println("Vector inverso");
        for (int i=vector.length-1;i>0;i--){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
       // for (int i=0;i<vector.length;i++){
        //    for (int j=i+1;j<vector.length;j++){
       //         if (vector[j]>vector[i]){
        //            aux=vector[j];
        //            vector[j]=vector[i];
        //            vector[i]=aux;
        //        }
        //    }
       // }
    }
    
}
