/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extra_6.Servicios;

import com.mycompany.extra_6.Atributos.Ahorcado;

import java.util.*;

/**
 *
 * @author crowl
 */
public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado ahor = new Ahorcado();
    int encontradas=0, faltantes;
    String palabra, letra;
    public void crearJuego()  {
        
        System.out.println("Ingrese la palabra a advinar");
        palabra = leer.next();
        ahor.setCantidad(palabra.length());
        faltantes=palabra.length();
        String[] vector = new String[palabra.length()];
        System.out.println("Ingrese la cantidad Maxima de jugadas");
        ahor.setJugadasMaximas(leer.nextInt());
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, (i + 1));
            ahor.setVector(vector);
            
        }
    }
    public void longuitud() {
        System.out.println("La longuitud de la palabra es de: " + ahor.getCantidad() + " letras.");
    }
    public void buscar() {
        
        int cont = 0;
        System.out.println("Ingrese letra a buscar\n=================");
        letra = leer.next();
        for (int i = 0; i < ahor.getCantidad(); i++) {
            if (ahor.getVector()[i].equals(letra)) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("Letra encontrada");
            
        } else {
            System.out.println("Letra NO encontrada");
          
        }

    }
    public void encontradas(){
        int cont=0;
        //boolean flag=cont>0;
        for (int i=0;i<palabra.length();i++){
        if (ahor.getVector()[i].equals(letra)){
            cont++;
            encontradas++;
        }
    }
        if(cont>0){
            System.out.println("La cantidad de letras encontradas es: "+cont+"\nLe faltan encontrar: "+(faltantes-cont));
            faltantes-=cont;
        }else{
            int hola=ahor.getJugadasMaximas()-1;
            System.out.println(hola);
            ahor.setJugadasMaximas(hola);
        }
        //return faltantes;
    }

    public void intentos() {
         System.out.println("Numero de intentos restantes: " + ahor.getJugadasMaximas());
    }

    public void juegoNuevo() {
        int cont=0;
        crearJuego();
        longuitud();
        do{
           if (faltantes==0){
               break;
           }
            buscar();
            encontradas();
            intentos();
            cont++;
        } while (ahor.getJugadasMaximas() > 0);
    }
    public String Mostar(){
        return palabra;
    }
}
