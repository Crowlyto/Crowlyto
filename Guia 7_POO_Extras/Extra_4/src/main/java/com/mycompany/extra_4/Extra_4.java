/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra_4;

import com.mycompany.extra_4.Atributos.NIF;
import com.mycompany.extra_4.Servicios.Servicios;

/**
 *
 * @author crowl
 */
public class Extra_4 {

    public static void main(String[] args) {
        Servicios serv=new Servicios();
        NIF nif=serv.crearNif(); 
        serv.mostrar(nif);
    }
}
