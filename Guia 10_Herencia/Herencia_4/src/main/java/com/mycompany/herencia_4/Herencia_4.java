
package com.mycompany.herencia_4;

import com.mycompany.herencia_4.enrtidades.Circulo;
import com.mycompany.herencia_4.enrtidades.Rectangulo;

public class Herencia_4 {

    public static void main(String[] args) {
        Circulo cir=new Circulo(7);
        cir.calcularArea();
        cir.calcularPerimetro();
        Rectangulo rec=new Rectangulo(2,5);
        rec.calcularArea();
        rec.calcularPerimetro();
    }
}
