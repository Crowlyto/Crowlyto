
package com.mycompany.relaciones_extra_2.entidades;
import java.util.ArrayList;

public class Cine {
    
    private Pelicula peli;
    private ArrayList<Espectador> espectador;
    private final double entrada=745;

    public Cine() {
    }

    public Cine(Pelicula peli, ArrayList<Espectador> espectador) {
        this.peli = peli;
        this.espectador = espectador;
    }

   

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public ArrayList<Espectador> getEspectador() {
        return espectador;
    }

    public void setEspectador(ArrayList<Espectador> espectador) {
        this.espectador = espectador;
    }

    public Double getEntrada() {
        return entrada;
    }

    

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", espectador=" + espectador + ", entrada=" + entrada + '}';
    }
 
}
