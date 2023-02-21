package com.mycompany.herencia_2.entidades;

import java.util.Scanner;

public abstract class Electrodomestico {

    protected double precio = 1000;
    protected String color;
    protected String consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, String consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    

    private String comprobarConsumoEnergetico(String letra) {
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B")
                || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D")
                || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("F")) {
            return letra;
        } else {
            return "F";
        }
    }

    private void comprobarColor(String color) {
        
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro")
                || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            this.color=color;
        } else {
            this.color="blanco";
            
    }
    }

    protected void precioFinal() {
        double precio = 0;
        if (this.peso < 20) {
            precio += 100;
        } else if (this.peso < 50) {
            precio += 500;
        } else if (this.peso < 80) {
            precio += 800;
        } else if (this.peso > 80) {
            precio += 1000;
        }
        
        String op=this.consumoEnergetico;
        op=op.toUpperCase();
        
       
        switch (op) {
            case "A":
                precio += 1000;
                break;
            case "B":
                precio += 800;
                break;
            case "C":
                precio += 600;
                break;
            case "D":
                precio += 500;
                break;
            case "E":
                precio += 300;
                break;
            case "F":
                precio += 100;
                break;
        }
       
        this.precio+=precio;
        System.out.println(this.precio);
    }
        protected void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color del producto");
        this.color = leer.next();
        comprobarColor(color);
        System.out.println(this.color);
        System.out.println("Ingrese el consumo energetico: A-B-C-D-E-F");
        this.consumoEnergetico = leer.next();
        System.out.println(this.consumoEnergetico);
        this.consumoEnergetico= comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println(this.consumoEnergetico);
        System.out.println("Ingrese el peso del producto");
        this.peso = leer.nextInt(); 
        
        
    }

    }

