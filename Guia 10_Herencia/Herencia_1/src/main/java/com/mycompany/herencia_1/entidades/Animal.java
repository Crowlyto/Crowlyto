
package com.mycompany.herencia_1.entidades;

public class Animal {
    
    private String nombre;
    private String alimento;
    private int edad;
    private String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    @Override
    public String toString() {
        return "El animal con nombre " + nombre + " y raza"+raza
                +"\nCon edad: "+edad+" años\n"
                + "Se alimenta con: "+alimento;
    }
    public void seAlimenta(){
       // System.out.println("Alimento: "+alimento);
        System.out.println("El animal con nombre " + nombre + " y raza "+raza
                +"\nCon edad: "+edad+" años\n"
                +"Alimentacion: "+alimento);
              
    }

    
            
}
