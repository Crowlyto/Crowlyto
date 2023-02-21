/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_3.entidades;

import com.mycompany.ejercicio_3.enumeradores.Enumerador;
import java.util.Objects;

/**
 *
 * @author crowl
 */
public class Carta {
    private Integer numero;
    private Enumerador palo;

    public Carta() {
    }

    public Carta(Integer numero, Enumerador palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Enumerador getPalo() {
        return palo;
    }

    public void setPalo(Enumerador palo) {
        this.palo = palo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.numero);
        hash = 97 * hash + Objects.hashCode(this.palo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return this.palo == other.palo;
    }

    

    @Override
    public String toString() {
        return "Carta" + numero + " de " + palo.toString();
    }
    
    
}
