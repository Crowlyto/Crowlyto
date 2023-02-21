
package com.mycompany.tienda.entidades;

public class Producto {
    protected int codigo;
    protected String nombre;
    protected double precio;
    protected Fabricante fabri;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, Fabricante fabri) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.fabri = fabri;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fabricante getFabri() {
        return fabri;
    }

    public void setFabri(Fabricante fabri) {
        this.fabri = fabri;
    }
    
    
}
