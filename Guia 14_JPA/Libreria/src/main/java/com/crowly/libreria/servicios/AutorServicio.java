package com.crowly.libreria.servicios;

import com.crowly.libreria.entidades.Autor;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AutorServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearAutor() {
        EntityManager emf= Persistence.createEntityManagerFactory("Libreria_Egg").createEntityManager();
        try {
            Autor autor = new Autor();
            autor.setId(Integer.SIZE);
            System.out.println("Ingrese el nombre del Autor");
            autor.setNombre(leer.next());
            autor.setAlta(true);
            
            emf.getTransaction().begin();
            emf.persist(autor);
            emf.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("Error de Sistema");

        }

    }
}
