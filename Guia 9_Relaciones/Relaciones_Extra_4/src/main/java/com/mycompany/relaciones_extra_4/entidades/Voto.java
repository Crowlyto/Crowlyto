package com.mycompany.relaciones_extra_4.entidades;

import java.util.ArrayList;

public class Voto {
    private Alumnos alumnoQueVoto;
    private ArrayList<Alumnos>votados;

    public Voto() {
    }

    public Voto(Alumnos alumnoQueVoto, ArrayList<Alumnos> votados) {
        this.alumnoQueVoto = alumnoQueVoto;
        this.votados = votados;
    }

    public Alumnos getAlumnoQueVoto() {
        return alumnoQueVoto;
    }

    public void setAlumnoQueVoto(Alumnos alumnoQueVoto) {
        this.alumnoQueVoto = alumnoQueVoto;
    }

    public ArrayList<Alumnos> getVotados() {
        return votados;
    }

    public void setVotados(ArrayList<Alumnos> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Votante:\n" + alumnoQueVoto + "\nVotados: " + votados;
    }

    
    
    
}
