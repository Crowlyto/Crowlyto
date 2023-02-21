/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crowly.libreria.servicios;

import com.crowly.libreria.entidades.Editorial;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author crowl
 */
public class EditorialServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearEditorial() {
        EntityManager emf= Persistence.createEntityManagerFactory("Libreria_Egg").createEntityManager();
        try {
            Editorial editorial = new Editorial();
            editorial.setId(Integer.SIZE);
            System.out.println("Ingrese el nombre del Autor");
            editorial.setNombre(leer.next());
            editorial.setAlta(true);
            
            emf.getTransaction().begin();
            emf.persist(editorial);
            emf.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("Error de Sistema");

        }

    }
}
