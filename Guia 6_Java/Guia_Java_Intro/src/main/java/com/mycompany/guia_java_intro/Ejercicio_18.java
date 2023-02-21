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
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz=new int[4][4];
        int[][] trans=new int[4][4];
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                matriz[i][j]=new Random().nextInt(16);
            }
        }
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
                   
        }
        System.out.println("");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                trans[j][i]=matriz[i][j];
            }
        }
        for (int i=0;i<trans.length;i++){
            for (int j=0;j<trans.length;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println(" ");
               
        }
    }
    
}
