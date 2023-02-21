package com.mycompany.tienda.DAO;

import com.mycompany.tienda.entidades.Fabricante;
import com.mycompany.tienda.entidades.Producto;
import java.sql.*;
import java.util.*;

public class ProductoDAO extends DAO {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Ejercicio_1 punto a)Lista el nombre de todos los productos que hay en la tabla producto.
    FabricanteDAO fab = new FabricanteDAO();

    public void listarNombres() throws Exception {
        try {
            crearConeccion();
            Statement stat = conex.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM producto");
            while (result.next()) {
                System.out.println(" | " + result.getString("nombre"));
            }
            desconectarBase();
        } catch (Exception e) {
            throw e;
        }
    }

    //Ejercicio_1 punto b)Lista los nombres y los precios de todos los productos de la tabla producto.
    public void listarNombresPrecios() {
        try {
            crearConeccion();
            Statement stat = conex.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM producto");
            while (result.next()) {
                System.out.println(" | " + result.getString("nombre") + " | $" + result.getDouble("precio"));
            }
            desconectarBase();
        } catch (Exception e) {
        }
    }

    //Ejercicio_1 c)Listar aquellos productos que su precio esté entre 120 y 202.
    public void listarFiltroPrecios() {

        try {
            crearConeccion();
            Statement stat = conex.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM producto WHERE precio BETWEEN 120 and 202");
            while (result.next()) {
                System.out.println(" | " + result.getInt("codigo") + " | " + result.getString("nombre") + " | $" + result.getDouble("precio"));
            }
            desconectarBase();
        } catch (Exception e) {
        }
    }

    //Ejercicio_1 d)Buscar y listar todos los Portátiles de la tabla producto.
    public void listarPortatiles() {
        try {
            crearConeccion();
            Statement stat = conex.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM producto WHERE nombre Like '%Portatil%'");
            while (result.next()) {
                System.out.println(" | " + result.getInt("codigo") + " | " + result.getString("nombre") + " | $" + result.getDouble("precio"));
            }
            desconectarBase();
        } catch (Exception e) {
        }
    }

    //Ejercicio_1 e)Listar el nombre y el precio del producto más barato.
    public void nombreMenorPrecio() {
        try {
            crearConeccion();
            Statement stat = conex.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM producto ORDER BY precio LIMIT 1");
            while (result.next()) {
                System.out.println(" | " + result.getInt("codigo") + " | " + result.getString("nombre") + " | $" + result.getDouble("precio"));
            }
            desconectarBase();
        } catch (Exception e) {
        }
    }

    public void agregarProducto() throws Exception {
        try {
            Producto produc = new Producto();
            Fabricante fabri = new Fabricante();
            System.out.println("Ingrese el codigo del Producto");
            produc.setCodigo(leer.nextInt());
            System.out.println("Ingrese el nombre de Producto");
            produc.setNombre(leer.next());
            System.out.println("Ingrese el precio del Producto");
            produc.setPrecio(leer.nextDouble());
            System.out.println("Ingrese el codigo de Fabricante");
            fab.listarFabricante();
            System.out.println("--------------------------------");
            fabri.setCodigo(leer.nextInt());
            System.out.println("Ingrese Nombre de Fabricante");
            fabri.setNombre(leer.next());
            produc.setFabri(fabri);
            crearConeccion();
            stat=conex.createStatement();
            stat.executeUpdate("INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) VALUES ("+produc.getCodigo()+",'"+produc.getNombre()+"',"+produc.getPrecio()+
                    ","+produc.getFabri().getCodigo()+")");
        } catch (Exception e) {
            throw e;
        }

    }
    
    public void eliminarProducto(){
        try {
            
            listarNombres();
            System.out.println("Ingrese el nombre del Producto");
            String nombre=leer.next();
            crearConeccion();
            stat=conex.createStatement();
            stat.executeUpdate("DELETE FROM producto WHERE nombre='"+nombre+"'");
            desconectarBase();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            
        }
        
    }

}
