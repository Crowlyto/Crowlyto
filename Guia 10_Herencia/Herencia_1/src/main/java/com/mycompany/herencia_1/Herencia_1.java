package com.mycompany.herencia_1;

import com.mycompany.herencia_1.entidades.*;

public class Herencia_1 {

    public static void main(String[] args) {
        System.out.println("------------------------");
        Animal perro = new Perro("Toby", "Omnivoro", 4, "Bulldog");
        perro.seAlimenta();
        System.out.println("------------------------");
        Animal gato = new Gato("Michifu", "Carnivoro", 7, "De la vida");
        gato.seAlimenta();
        System.out.println("------------------------");
        Animal caballo = new Caballo("Hermes", "Herbivoro", 12, "Percheron");
        caballo.seAlimenta();
        System.out.println("------------------------");

    }
}
