/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones_6.Servicios;

import com.mycompany.colecciones_6.Atributos.Productos;
import java.util.*;

/**
 *
 * @author crowl
 */
public class Servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> produ = new HashMap();
    public void cargaProductos() {
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.next().toUpperCase();
        System.out.println("Ingrese precio");
        double precio = leer.nextDouble();
        if (!produ.containsKey(nombre)) {
            agregarLista(nombre, precio);
        } else {
            System.out.println("El producto ya esta en lista");
        }
    }
    public void agregarLista(String nombre, double precio) {
        produ.put(nombre, precio);
    }
    public void mostrarProdcutos() {
        HashMap<String, Double> one = new HashMap(produ);
        if (!one.isEmpty()) {
            for (Map.Entry<String, Double> aux : one.entrySet()) {
                System.out.println("Producto: " + aux.getKey() + "\nPrecio: " + aux.getValue());
            }
        } else {
            System.out.println("No hay productos en la lista");
        }
    }
    public void modificarProducto() {
        System.out.println("Ingrese nombre del prodcuto a modificar");
        String nombre2 = leer.next().toUpperCase();
        System.out.println("Ingrese nuevo precio");
        double precio2 = leer.nextDouble();

        if (produ.containsKey(nombre2)) {
            agregarLista(nombre2, precio2);
        } else {
            System.out.println("NO se encuentra el producto solicitado");
        }
    }
    public void eliminarProducto() {
        System.out.println("Ingrese nombre del prodcuto a modificar");
        String nombre3 = leer.next().toUpperCase();
        if (produ.remove(nombre3)!=null) {
            System.out.println("Producto Elimninado");
        } else {
            System.out.println("NO se encuentra el producto solicitado");
        }
    }
    public void menu() {
        int opcion;
        System.out.println("SISTEMA DE CARGA Y CONSULTAS DE PRODUCTOS");
        System.out.println("=========================================");
        do {
            System.out.println("ELIJA UNA OPCION\n"
                    + "1-CARGA DE PRODUCTOS\n"
                    + "2-CONSULTA DE PRODUCTOS\n"
                    + "3-MODIFICAR PRECIO\n"
                    + "4-ELIMINAR PRODUCTO\n"
                    + "5-SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cargaProductos();
                    break;
                case 2:
                    mostrarProdcutos();
                    break;
                case 3:
                    modificarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.out.println("Usted ha salido");
            }
            System.out.println("");
        } while (opcion == 5);
    }
}
