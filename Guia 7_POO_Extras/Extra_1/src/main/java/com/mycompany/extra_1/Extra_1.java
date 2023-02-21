/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra_1;

import com.mycompany.extra_1.Atributos.Cancion;

/**
 *
 * @author crowl
 */
public class Extra_1 {

    public static void main(String[] args) {
        Cancion can=new Cancion("Before i forget","Slipknot");
        System.out.println("El titulo de la cancion es : "+can.getTitulo());
        System.out.println("El autor es: "+can.getAutor());
    }
}
