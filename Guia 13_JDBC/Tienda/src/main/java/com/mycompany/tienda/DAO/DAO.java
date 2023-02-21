
package com.mycompany.tienda.DAO;

import com.mycompany.tienda.entidades.Fabricante;
import java.sql.*;
import java.util.*;
public class DAO {
    Connection conex=null;
    ResultSet result =null;
    Statement stat =null;
    
    
    public void crearConeccion(){
        try {
            conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "@123=Lvf");
            
        } catch (Exception e) {
            System.out.println("No Conecta");

        }
    }
    public void desconectarBase(){
        try {
            if (conex!=null) {
                conex.close();
               
            }
            if (result!=null) {
                result.close();
            }
            if (stat!=null) {
                stat.close();
            }
        } catch (Exception e) {
        }
    }
    public void insertarDatos(Fabricante f){
        try {
            Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "@123=Lvf");
            Statement stat = conex.createStatement();
            String instruccionesSQL="INSERT INTO fabricante(codigo, nombre) VALUES (10,'Leandro')";
            stat.executeUpdate(instruccionesSQL);
        } catch (Exception e) {
        }
        
        
    }
}
//1-Crear Conexion
//2-Crear objeto Statement para enviar querys a la base de datos
            //Statement stat = conex.createStatement();
            //3-Ejecutar SQL
           
            //ResultSet result = stat.executeQuery("SELECT * FROM fabricante");
            //4-Recorrer el Resulset(interface)
            //while (result.next()) {
            //    System.out.println(result.getInt("codigo") + " " + result.getString("nombre"));
            //}