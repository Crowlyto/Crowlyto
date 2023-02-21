/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extra_4.Atributos;

/**
 *
 * @author crowl
 */
public class NIF {
    private long DNI;
    private String NIF;

    public NIF() {
    }

    public NIF(long DNI, String NIF) {
        this.DNI = DNI;
        this.NIF = NIF;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", NIF=" + NIF + '}';
    }
    
}
