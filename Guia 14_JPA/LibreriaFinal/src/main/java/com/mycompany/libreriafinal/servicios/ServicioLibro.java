
package com.mycompany.libreriafinal.servicios;

import com.mycompany.libreriafinal.entidad.Autor;
import com.mycompany.libreriafinal.entidad.Editorial;
import com.mycompany.libreriafinal.entidad.Libro;
import com.mycompany.libreriafinal.persistencia.LibroDAO;
import java.util.List;
import java.util.UUID;

public class ServicioLibro {
    private LibroDAO libroDAO;

    public ServicioLibro() {
        libroDAO = new LibroDAO();

    }

    public Libro creaLibro(String titulo, Integer anio, Autor autor, Editorial editorial) {
        Libro libronuevo = new Libro();

        try
        {
            if (titulo == null || titulo.trim().isEmpty())
            {
                throw new Exception("Debe indicar el titulo del libro");
            }
            libronuevo.setTitulo(titulo);

            if (anio == null || anio < 0)
            {
                throw new Exception("Debe indicar el año");
            }
            libronuevo.setAnio(anio);

            if (autor == null)
            {
                throw new Exception("Autor nulo");
            }
            libronuevo.setAutor(autor);

            if (editorial == null)
            {
                throw new Exception("Editorial nulo");
            }

            libronuevo.setEditorial(editorial);

            //Magia para obtener los ejemplares
            int ejemplares = (int) (Math.random() * 999 + 1);
            int prestados = ejemplares - (int) (Math.random() * 88 + 1);
            

            libronuevo.setIsbn((long) (int) (Math.random() * 999999 + 1));

            libronuevo.setEjemplares(ejemplares);
            libronuevo.setEjemplaresPrestados(prestados);

            libronuevo.setEjemplaresRestantes(ejemplares - prestados);

            

            libronuevo.setAlta(Boolean.TRUE);
            libroDAO.guardarLibro(libronuevo);

            return libronuevo;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void eliminarLibro(String titulo) {

        try
        {
            if (titulo == null || titulo.trim().isEmpty())
            {
                throw new Exception("Debe indicar el titulo del libro");
            }
            libroDAO.eliminaPorTitulo(titulo);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public void eliminarPorEditorial(Editorial edit) {

        try
        {
            if (edit == null)
            {
                throw new Exception("Debe indicar la Editorial");
            }
            libroDAO.eliminaPorEditorial(edit);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public List<Libro> buscaLibro(String titulo) {
        List<Libro> buscado = null;

        try
        {
            if (titulo == null || titulo.trim().isEmpty())
            {
                throw new Exception("Debe indicar el titulo del libro");
            }

            buscado = libroDAO.buscaPorTitulo(titulo);

            return buscado;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public Libro buscaISBN(Long isbn) {
        Libro buscado = null;

        try
        {
            if (isbn == null || isbn < 0)
            {
                throw new Exception("Debe indicar el ISBN");
            }

            buscado = libroDAO.buscaPorISBN(isbn);

            return buscado;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public List<Libro> buscaPorAutor(String nombre) {

        List<Libro> buscado = null;

        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del Autor");
            }

            buscado = libroDAO.buscaPorAutor(nombre);

            return buscado;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Libro> buscaPorEditorial(String nombre) {

        List<Libro> buscado = null;

        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }

            buscado = libroDAO.buscaPorEditorial(nombre);

            return buscado;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public List<Libro> buscaTodo() {
        List<Libro> buscado = null;

        try
        {

            buscado = libroDAO.listarTodos();

            return buscado;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }
   
}
