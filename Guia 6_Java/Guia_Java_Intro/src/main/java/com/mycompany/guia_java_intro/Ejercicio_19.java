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
public class Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][]matriz={{0,-2,4},{2,0,2},{-4,-2,0}};
        double[][]trans={{0,2,-4},{-2,0,-2},{4,2,0}};
        int cont=matriz.length*trans.length;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                if (matriz[i][j]==trans[j][i]){
                  cont--; 
                }
            }
        }
        if (cont==0){
            System.out.println("Es una matriz Anti-Simetrica");
        }else
            System.out.println("La matriz no es Anti-Simetrica");
     
     
    }
    
    
}
