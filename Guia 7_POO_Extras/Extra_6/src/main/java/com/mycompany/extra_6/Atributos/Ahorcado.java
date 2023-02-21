/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extra_6.Atributos;

/**
 *
 * @author crowl
 */
public class Ahorcado {
    private String[]vector;
    private int cantidad;
    private int jugadasMaximas;
    

    public Ahorcado() {
        this.vector=new String[cantidad];
    }

    public Ahorcado(String[] vector, int cantidad, int jugadasMaximas) {
        this.vector = vector;
        this.cantidad = cantidad;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

 
    @Override
    public String toString() {
        return "Ahorcado{" + "vector=" + vector + ", cantidad=" + cantidad + ", jugadasMaximas=" + jugadasMaximas + '}';
    }

 
}
