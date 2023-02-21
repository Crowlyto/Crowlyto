
package com.mycompany.herencia_2.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    protected int pulgadas;
    protected boolean TDT;

    public Televisor() {
    }
    
    public Televisor(int pulgadas, boolean TDT, double precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    protected void precioFinal() {
        super.precioFinal(); 
        double precio=super.getPrecio();
        if (this.pulgadas>40){
            precio=precio*1.30;
        }
        if (this.TDT){
            precio+=500;
        }
        super.setPrecio(precio);
    }
    
    
    public void crearTelevisor(){
        Scanner leer=new Scanner(System.in);
        Televisor tv= new Televisor();
        System.out.println("Datos Televisor");
        System.out.println("Ingrese las Pulgadas");
        this.pulgadas=leer.nextInt();
        System.out.println("Incluye Sintonizador TDT?");
        String td=leer.next();
        if (td.equalsIgnoreCase("S")){
            this.TDT=true;
        }else{
            this.TDT=false;
        }
        super.crearElectrodomestico();
        precioFinal();
    }
    
}
