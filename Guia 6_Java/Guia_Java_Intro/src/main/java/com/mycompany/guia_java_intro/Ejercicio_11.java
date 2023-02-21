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
public class Ejercicio_11 {

    /**
     * 
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un valor");
        double num=leer.nextDouble();
        System.out.println("Ingrese una valor");
        double num1=leer.nextDouble();
        do{
            System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija una opcion");
        int opc=leer.nextInt();
         switch (opc){
            
                case 1:
                    System.out.println("La suma es: "+(num+num1));
                    break;
                case 2:
                    System.out.println("La resta es: "+(num-num1));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: "+(num*num1));
                    break;
                case 4:
                    System.out.println("La division es: "+(num/num1));
                    break;
                case 5:
                    System.out.println("Usted a salido");
                    break;
         }
                
        
        }while(num==0 || num>5);
    }
    
}
