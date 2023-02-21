package com.mycompany.relaciones_extra_4.entidades;

import java.util.Comparator;

public class Alumnos {
    private String nombreCompleto;
    private int DNI;
    private int cantidadVotos;

    public Alumnos() {
    }

    public Alumnos(String nombreCompleto, int DNI, int cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
    public void incrementaVoto() {
        this.cantidadVotos++;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombreCompleto + ", DNI" + DNI + ", Votos=" + cantidadVotos;
    }
    
    
}
