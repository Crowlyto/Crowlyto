
package com.mycompany.ejercicio_3.servicios;

import com.mycompany.ejercicio_3.entidades.Baraja;
import com.mycompany.ejercicio_3.entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Servicio {
    private Baraja baraja;
    private ArrayList<Carta> mazo;
    
    
    public void barajar(){
        Collections.shuffle(mazo);
        System.out.println("El Mazo Fue Mezclado");
    }
    public Carta siguienteCarta(){
        Carta aux= baraja.getBaraja().get(0);
        baraja.getBaraja().remove(0);
        
        return aux;
    }
    public void cartasDisponibles(){
        System.out.println("Quedan "+mazo.size()+" cartas");
    }
    public void darCartas(int restantes){
        ArrayList<Carta> hand=new ArrayList();
        for(int i=0;i<restantes;i++){
            hand.add(mazo.get(i));
            mazo.remove(i);
        }
        for (Carta carta : hand) {
            System.out.println(carta);
        }
    }
    public void mostrarBaraja(){
        for (Carta aux : mazo) {
            System.out.println(aux);
        }
    }
     public void ordenarBaraja(){
        
    }
      public static Comparator<Carta> porPalo = new Comparator<Carta>() {
        @Override
        public int compare(Carta c1, Carta c2) {
            return c1.getPalo().compareTo(c2.getPalo());
        }
    };
    
    public static Comparator<Carta> porNumero = new Comparator<Carta>() {
        @Override
        public int compare(Carta c1, Carta c2) {
            return c1.getNumero().compareTo(c2.getNumero());
        }
    };
}
