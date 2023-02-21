
package com.mycompany.libreriafinal.persistencia;

import com.mycompany.libreriafinal.entidad.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author crowl
 */
public class AutorDAO {
    private final EntityManager em= Persistence.createEntityManagerFactory("LibreriaFinal").createEntityManager();
    //Busqueda por 
    public Autor buscarPorNombre(String nombre)throws Exception{
        Autor autor=(Autor) em.createQuery("SELECT d "+
                "FROM Autor d"+
                "WHERE d.nombre LIKE .nombre").setParameter("nombre", nombre).getSingleResult();
        return autor;
        
    }
    public Autor buscarPorId(Integer id) throws Exception {
        Autor autor = em.find(Autor.class, id);
        return autor;
    }
    //Crear
    public void guardarAutor(Autor autor) throws Exception {
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }
    public List<Autor> listarTodos() throws Exception {
        List<Autor> autores = em.createQuery("SELECT d FROM Autor d")
                .getResultList();
        return autores;
    }
    //Modificar
    public void modificarAutor(Autor autor) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(autor); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();
    }
    //Eliminar
    public void eliminar(Integer id) throws Exception {
        Autor autor = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
    }

    public void eliminarPorNombre(String nombre) throws Exception {
        Autor autor = buscarPorNombre(nombre);
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
    }
    
    
}
