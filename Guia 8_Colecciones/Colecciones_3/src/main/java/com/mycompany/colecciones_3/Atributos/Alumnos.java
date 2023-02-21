/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones_3.Atributos;

import java.util.ArrayList;

/**
 *
 * @author crowl
 */
public class Alumnos {
    private String alumnos;
    private ArrayList<Double> notas;

    public Alumnos() {
        notas=new ArrayList<Double>();
    }

    public Alumnos(String alumnos, ArrayList<Double> notas) {
        this.alumnos = alumnos;
        this.notas = notas;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno: " + alumnos + ",\nNotas: " + notas.get(0)+"; " + notas.get(1)+"; "+notas.get(2);
    }
    
    
}
