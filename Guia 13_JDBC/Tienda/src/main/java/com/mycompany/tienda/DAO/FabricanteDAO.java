package com.mycompany.tienda.DAO;

import com.mycompany.tienda.entidades.Fabricante;
import java.sql.ResultSet;
import java.sql.Statement;

public class FabricanteDAO extends DAO {

    public void listarFabricante() {
        try {
            crearConeccion();
            Statement stat = conex.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM fabricante");
            System.out.println("Listado de Fabricante");
            while (result.next()) {
                System.out.println(" | " +result.getInt("codigo")+" | "+ result.getString("nombre"));
            }
            desconectarBase();
        } catch (Exception e) {
        }
    }
   /* public Fabricante crearFabricante(){
        Fabricante aux=new Fabricante();
        
        
    }*/

}
