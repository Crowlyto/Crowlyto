
package com.mycompany.herencia_4.enrtidades;


public class Rectangulo implements CalculoFormas{
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    @Override
    public void calcularArea(){
        System.out.println("El area del recangulo es: "+(this.base*this.altura));
    }
    @Override
    public void calcularPerimetro(){
        System.out.println("El perimetro del Rectagulo es: "+(this.base+this.altura)*2);
    }
    
    
}
