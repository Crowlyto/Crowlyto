/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.extra_5;

import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Extra_5 {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        String M1[] = new String[12];
        String mesSecreto;
        String adivine;
        
       M1[0] = "enero";
       M1[1] = "febrero";
       M1[2] = "marzo";
       M1[3] = "Abril";
       M1[4] = "mayo";
       M1[5] = "junio";
       M1[6] = "julio";
       M1[7] = "agosto";
       M1[8] = "septiembre";
       M1[9] = "octubre";
       M1[10] = "noviembre";
       M1[11] = "diciembre";
        
        mesSecreto = M1[(int) (Math.random() * 12)];
        do {
            System.out.println("Adivine el mes secreto escrito en minusculas: ");
            adivine = leer.next();
            
        } while (!adivine.equals(mesSecreto));
        System.out.println("Adivinaste..!!!!!");    
}
}
