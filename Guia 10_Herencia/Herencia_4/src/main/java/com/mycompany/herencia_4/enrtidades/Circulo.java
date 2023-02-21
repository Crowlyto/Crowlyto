
package com.mycompany.herencia_4.enrtidades;

public class Circulo implements CalculoFormas{
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public void calcularArea(){
        System.out.println("El area del circulo es: "+ CalculoFormas.pi*(this.radio*this.radio));
    }
    @Override
    public void calcularPerimetro(){
        System.out.println("El perimetro del circulo es: "+ CalculoFormas.pi*(2*this.radio));
    }
    
}
