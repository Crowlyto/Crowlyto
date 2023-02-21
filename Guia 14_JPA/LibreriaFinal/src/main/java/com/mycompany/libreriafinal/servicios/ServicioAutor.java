/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriafinal.servicios;

import com.mycompany.libreriafinal.entidad.Autor;
import com.mycompany.libreriafinal.persistencia.AutorDAO;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author crowl
 */
public class ServicioAutor {
    private AutorDAO autorDAO;

    public ServicioAutor() {
        autorDAO = new AutorDAO();

    }

    public Autor creaAutor(String nombre) {
        Autor autornuevo = new Autor();
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del autor");
            }
            autornuevo.setNombre(nombre);
            
            autornuevo.setAlta(Boolean.TRUE);
            autorDAO.guardarAutor(autornuevo);

            return autornuevo;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void eliminarautor(String nombre) {

        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del autor");
            }
            autorDAO.eliminarPorNombre(nombre);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void modificaAutor(String nombre, String nuevonombre) {
        Autor aux = null;
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del autor");
            }
            if (nuevonombre == null || nuevonombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del autor");
            }
            aux = autorDAO.buscarPorNombre(nombre);
            aux.setNombre(nuevonombre);
            autorDAO.modificarAutor(aux);

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public Autor buscaAutor(String nombre) {

        Autor buscado = null;

        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del Autor");
            }

            buscado = autorDAO.buscarPorNombre(nombre);

            return buscado;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public List<Autor> buscaTodo() {
        List<Autor> buscado = null;

        try
        {
            buscado = autorDAO.listarTodos();
            return buscado;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }
    
}
