/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones_4;

import com.mycompany.colecciones_4.Pelicula;
import java.util.*;

/**
 *
 * @author crowl
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> lista;

    public Servicio() {
        lista = new ArrayList<Pelicula>();
    }

    public void ingresoDatos() {
        String nombre, director;
        Integer duracion;
        System.out.println("Ingrese el titulos de la pelicula");
        nombre = leer.next();
        System.out.println("Ingrese el nombre del Director de la pelicula");
        director = leer.next();
        System.out.println("Ingrese la duracion de la pelicula en HS");
        duracion = leer.nextInt();
        crearPelicula(nombre, director, duracion);
    }

    public void crearPelicula(String nombre, String director, int duracion) {
        Pelicula peli = new Pelicula();
        peli.setTitulo(nombre);
        peli.setDirector(director);
        peli.setDuracion(duracion);
        agregarPelicula(peli);
    }

    public void agregarPelicula(Pelicula peli) {
        lista.add(peli);
    }

    public void mostaraTodas() {
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);

        }
    }

    public void mostrarHora() {
        for (Pelicula pelicula : lista) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }

        }
    }

    public void ordenDes() {
        Collections.sort(lista, Comparadores.ordenDuracionDes);
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);

        }
    }

    public void ordenAsc() {
        Collections.sort(lista, Comparadores.ordenDuracionAsc);
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);
        }

    }

    public void ordenTitutlo() {
        Collections.sort(lista, Comparadores.ordenTitulo);
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);
        }
    }
    public void ordenDirector(){
        Collections.sort(lista, Comparadores.ordenDirector);
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);
        }
    }
}
