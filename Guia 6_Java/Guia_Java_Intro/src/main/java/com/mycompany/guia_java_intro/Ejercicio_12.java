/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia_java_intro;

import java.util.Scanner;

/**
 *
 * 
 */
public class Ejercicio_12 {

    /**
     * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cont=0, cont1=0;
        String cadena;
        do{
            System.out.println("Ingrese datos a enviar");
            cadena=leer.nextLine();
            int lon=cadena.length();
            if ((cadena.length()<=5)&&(cadena.substring(0,1).equals("X"))&&(cadena.substring(lon-1).equals("O"))){
                cont++;
            }else if (!"&&&&&".equals(cadena)){
                cont1++;
            }
                
        }while (!"&&&&&".equals(cadena));
        System.out.println("La cantidad de ingresos correctos es de "+cont);
        System.out.println("La cantidad de ingresos incorrectos es de "+cont1);        
            
        
    }
    
}
