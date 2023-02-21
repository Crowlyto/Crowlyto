/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra_3;

import com.mycompany.extra_3.Atributos.Raices;
import com.mycompany.extra_3.Servicios.Servcios;
import java.util.*;

/**
 *
 * @author crowl
 */
public class Extra_3 {
Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        Servcios serv=new Servcios();
        Raices raiz=serv.ingresoDatos();
        System.out.println(serv.getDiscriminante(raiz));
        System.out.println("Tiene mas de una solucion??"+serv.tieneRaices(raiz));
        serv.obtenerRaices(raiz);
        serv.ontenerRaiz(raiz);
        serv.calcular(raiz);
    }
}
