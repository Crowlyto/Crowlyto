
package com.mycompany.libreriafinal.persistencia;


import com.mycompany.libreriafinal.entidad.Editorial;
import com.mycompany.libreriafinal.entidad.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class LibroDAO {
    private final EntityManager em= Persistence.createEntityManagerFactory("LibreriaFinal").createEntityManager();

    
    public void guardarLibro(Libro libro) throws Exception {
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
    }

    public Libro buscarPorId(String id) throws Exception {
        Libro libro = em.find(Libro.class, id);
        return libro;
    }

    public List<Libro> buscaPorTitulo(String titulo) throws Exception {

        try
        {
            List<Libro> libros = em.createQuery("SELECT l "
                    + " FROM Libro l"
                    + " WHERE l.titulo LIKE CONCAT('%', :titulo, '%')", Libro.class)
                    .setParameter("titulo", titulo)
                    .getResultList();
            return libros;
        } catch (Exception e)
        {
            System.out.println("ERROR al buscar por titulo");
            return null;
        }

    }

    public Libro buscaPorISBN(Long isbn) throws Exception {
        try
        {
            Libro libro = (Libro) em.createQuery("SELECT l "
                    + " FROM Libro l"
                    + " WHERE l.isbn = :isbn").
                    setParameter("isbn", isbn).
                    getSingleResult();
            return libro;

        } catch (Exception e){
            System.out.println("ERROR al buscar por ISBN");
            return null;
        }
    }

    public List<Libro> buscaPorAutor(String nombAut) throws Exception {
        try
        {
            List<Libro> libros = em.createQuery("SELECT l "
                    + " FROM Libro l"
                    + " WHERE l.autor.nombre LIKE CONCAT('%', :nombre, '%')", Libro.class)
                    .setParameter("nombre", nombAut)
                    .getResultList();
            return libros;
        } catch (Exception e){
            System.out.println("ERROR al buscar por Autor");
            return null;
        }
    }

    public List<Libro> buscaPorEditorial(String nombEdit) throws Exception {
        try
        {
            List<Libro> libros = em.createQuery("SELECT l "
                    + " FROM Libro l"
                    + " WHERE l.editorial.nombre LIKE CONCAT('%', :nombre, '%')", Libro.class)
                    .setParameter("nombre", nombEdit)
                    .getResultList();
            return libros;
        } catch (Exception e)
        {
            System.out.println("ERROR al buscar por Autor");
            return null;
        }
}
    public void eliminar(String id) throws Exception {
        Libro libro = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }

    public void eliminaPorTitulo(String titulo) throws Exception {
        List<Libro> libros = buscaPorTitulo(titulo);
        Libro buscado = new Libro();
        try
        {
            if (libros == null)
            {
                System.out.println("NO existe un libro con ese titulo");
            } else
            {
                for (Libro aux : libros)
                {
                    if (aux.getTitulo() == titulo)
                    {
                        buscado = aux;
                    }
                }
                em.getTransaction().begin();
                em.remove(buscado);
                em.getTransaction().commit();
            }
        } catch (Exception e)
        {
            System.out.println("Error al Eliminar");
        }
    }

    public void eliminaPorEditorial(Editorial edit) throws Exception {
        List<Libro> libros = buscaPorEditorial(edit.getNombre());
        //Libro buscado = new Libro();
        try
        {
            if (libros == null || libros.size()==0)
            {
                System.out.println("NO existe un libro con esa Editorial");
            } else
            {
                for (Libro aux : libros)
                {
                    if (aux.getEditorial().getId().equals(edit.getId()))
                    {
                        em.getTransaction().begin();
                        em.remove(aux);
                        em.getTransaction().commit();
                    }

                }
            }
        } catch (Exception e)
        {
            System.out.println("Error al Eliminar");
        }
    }
     public List<Libro> listarTodos() throws Exception {
        List<Libro> libros = em.createQuery("SELECT d FROM Libro d")
                .getResultList();
        return libros;
    }
}

