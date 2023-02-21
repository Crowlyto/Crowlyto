
package com.mycompany.ejercicio_3.enumeradores;


public enum Enumerador {
    espada, basto, oro, copa;
    
    public static Enumerador obtenerRandom(){
        return values()[(int)(Math.random()*values().length)];
    }
}
