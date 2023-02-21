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
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int num=leer.nextInt();
        int[]vector=new int[num];        
        for (int i=0;i<vector.length;i++){ 
            vector[i]=new Random().nextInt(20);
        }
         for (int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
        System.out.println("Ingrese el Valor a buscar(0-20)"); 
        int valor=leer.nextInt();   
        for (int i=0;i<vector.length;i++){
            if (vector[i]==valor){
                System.out.println("El valor esta en la posicion "+(i+1));
            }
        }
    }
    
    
    
        
    
        
 }
    

