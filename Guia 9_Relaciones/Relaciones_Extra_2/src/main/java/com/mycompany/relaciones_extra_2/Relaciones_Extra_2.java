
package com.mycompany.relaciones_extra_2;

import com.mycompany.relaciones_extra_2.entidades.Sala;
import com.mycompany.relaciones_extra_2.servicios.ServicioSala;
import java.util.ArrayList;

public class Relaciones_Extra_2 {

    public static void main(String[] args) {
        ServicioSala serv=new ServicioSala();
        // Me imprime un arraylis de arraylist tipo string, esta inicializado en la clase sala
//        Sala sala=new Sala();
//        ArrayList<ArrayList<String>> salita=new ArrayList();
//        salita=sala.getSalaCine();
//        for (ArrayList<String> aux : salita) {
//            System.out.println(aux);
//            
//        }
       serv.listaPeliculas();//Esto me llena una lista de 6 peliculas
       serv.seleccionPelicula();//Se elije una pelicula para pasar en la sala
       serv.crearEspectador();//Creo especatdores
       serv.llenarSala();
    }
}
