
package com.mycompany.jpa;

import com.mycompany.jpa.Entidades.Fabricante;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPA {

    public static void main(String[] args) {
        try{
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA_UNO");
        EntityManager em=emf.createEntityManager();
        
            try {
                //Creo el objeto con sus atributos
                Fabricante fab1=new Fabricante();
                //El ID lo genero aleatorio
                fab1.setId(UUID.randomUUID().toString());
                fab1.setCodigo(1);
                fab1.setNombre("Crowly");
                
                //Empezar transaccion
                em.getTransaction().begin();
                //Guardar el objeto
                em.persist(fab1);
                //Confirmamos el guardado
                em.getTransaction().commit();
                
                
                
                
            } catch (Exception e) {
                System.out.println("Algun pedo hay");
            }
        }catch(Exception e){
            System.out.println("Sigue como el ano");
        }
    }
}
