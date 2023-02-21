/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.colecciones_1_2;

import java.util.*;

/**
 *
 * @author crowl
 */
public class Colecciones_1_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String Raza, opcion = "";
        ArrayList<String> razaPerro = new ArrayList<String>();
        System.out.println("VAMOS A INGRESAS RAZAS DE PERROS EN UN ArrayList\n=========================================");
        do {
            System.out.println("Ingrese una raza de perro");
            Raza = leer.next();
            razaPerro.add(Raza);
            System.out.println("Desea agregar una nueva raza?- S/N");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
        System.out.println("=========================================");
        for (String aux : razaPerro) {
            System.out.println(aux);
        }
        System.out.println("Ingrese una raza a eliminar del ArrayList");
        Raza = leer.next();
        boolean flag=false;
        //for (int i = 0; i < razaPerro.size(); i++) {
            if (razaPerro.equals(Raza)){
                razaPerro.remove(Raza);
                flag=true;
                System.out.println("La raza fue eliminada de la Lista");
                
            }
        //}
        if (flag==false){
            System.out.println("Raza no encontrada");
        }
    Collections.sort(razaPerro);
    for (String aux : razaPerro) {
            System.out.println(aux);
    }
    }
}
