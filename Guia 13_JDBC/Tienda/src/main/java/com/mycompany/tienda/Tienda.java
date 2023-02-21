package com.mycompany.tienda;

import com.mycompany.tienda.DAO.DAO;
import com.mycompany.tienda.DAO.ProductoDAO;
import com.mycompany.tienda.entidades.Fabricante;
import java.sql.*;
import java.util.*;

/**
 *
 * @author crowl
 */
public class Tienda {

    public static void main(String[] args) throws Exception {
       
        
        ProductoDAO produ=new ProductoDAO();
        System.out.println("-------------------\n"
                + "Productos por Nombre");
        produ.listarNombres();
        System.out.println("-------------------\n"
                + "Productos por Nombre y precio");
        produ.listarNombresPrecios();
        System.out.println("-------------------\n"
                + "Productos por Nombre y precio entre $120 y $202");
        produ.listarFiltroPrecios();
        System.out.println("-------------------\n"
                + "Lista de Portatiles");
        produ.listarPortatiles();
        System.out.println("-------------------\n"
                + "Producto de menor Precio");
        produ.nombreMenorPrecio();
//        System.out.println("-------------------\n"
//                + "Agregar Producto");
//        produ.agregarProducto();
 //       produ.eliminarProducto();
    
    }
}
