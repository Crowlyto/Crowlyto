
package com.mycompany.libreriafinal.persistencia;

import com.mycompany.libreriafinal.entidad.Editorial;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EditorialDAO {
    private final EntityManager em=Persistence.createEntityManagerFactory("LibreriaFinal").createEntityManager();
    
    public List<Editorial> buscarPorNombre(String nombre) throws Exception {
        // Para traer objeto con el nombre
        List<Editorial> editorial = em.createQuery("SELECT d "
                + " FROM Editorial d"
                + " WHERE d.nombre LIKE CONCAT('%', :nombre, '%')", Editorial.class)
                .setParameter("nombre", nombre)
                .getResultList();
        return editorial;
    }

    public Editorial buscarPorId(Integer id) throws Exception {
        Editorial editorial = em.find(Editorial.class, id);
        return editorial;
    }

    public void guardarEditorial(Editorial editorial) throws Exception {
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
    }

    public List<Editorial> listarTodos() throws Exception {
        List<Editorial> editoriales = em.createQuery("SELECT d FROM Editorial d")
                .getResultList();
        return editoriales;
    }

    public void modificarEditorial(Editorial editorial) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(editorial); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();
    }

    public void eliminar(Editorial editorial) throws SQLIntegrityConstraintViolationException, Exception {
        //Editorial editorial = buscarPorId(id);
        
        try
        {
            em.getTransaction().begin();
            em.remove(editorial);
            em.getTransaction().commit();
            throw new SQLIntegrityConstraintViolationException();
            
        } catch (Exception e)
        {
            //e.printStackTrace();
           throw e;

        }

    }
    
}
