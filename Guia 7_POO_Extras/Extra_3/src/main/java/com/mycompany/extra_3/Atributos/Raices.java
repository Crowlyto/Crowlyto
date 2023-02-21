/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extra_3.Atributos;

/**
 *
 * @author crowl
 */
public class Raices {
    private int A;
    private int B;
    private int C;
    private double discrim;
    

    public double getDiscrim() {
        return discrim;
    }

    public void setDiscrim(double discrim) {
        this.discrim = discrim;
    }

    
    

    public Raices() {
    }

    public Raices(int A, int B, int C, double discrim) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }
    
}
