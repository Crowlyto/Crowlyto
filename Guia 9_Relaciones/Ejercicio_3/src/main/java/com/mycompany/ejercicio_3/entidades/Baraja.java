
package com.mycompany.ejercicio_3.entidades;

import com.mycompany.ejercicio_3.enumeradores.Enumerador;
import java.util.HashSet;
import java.util.Set;

public class Baraja {
    private int numero;
    private Set<Carta> baraja;
    public Baraja() {
        this.baraja=new HashSet();
        
            for(int j=1;j<13;j++){
                if(j!=8 && j!=9){
                    this.baraja.add(new Carta(j, Enumerador.basto));
                    this.baraja.add(new Carta(j, Enumerador.espada));
                    this.baraja.add(new Carta(j, Enumerador.copa));
                    this.baraja.add(new Carta(j, Enumerador.oro));
                }
            }
       
    }

    public Baraja(int numero, Set<Carta> baraja) {
        this.numero = numero;
        this.baraja = baraja;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Set<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(Set<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "numero=" + numero + ", baraja=" + baraja + '}';
    }
    
    
    
}
