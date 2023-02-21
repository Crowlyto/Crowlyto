/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones_5.Atributos;

/**
 *
 * @author crowl
 */
public class Paises implements Comparable<Paises>{
    
   private String pais;

    public Paises() {
    }

    public Paises(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return pais ;
    }

    @Override
    public int compareTo(Paises o) {
        return this.pais.compareTo(o.getPais());
    };
   
}
