

package com.mycompany.libreriafinal.servicios;

import com.mycompany.libreriafinal.entidad.Editorial;
import com.mycompany.libreriafinal.persistencia.EditorialDAO;
import java.util.List;
import java.util.UUID;

public class ServicioEditorial {
    private EditorialDAO editorialDAO;

    public ServicioEditorial() {
        editorialDAO = new EditorialDAO();

    }

    public Editorial creaEditorial(String nombre) {
        Editorial editorialnuevo = new Editorial();
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del editorial");
            }
            editorialnuevo.setNombre(nombre);
           
            editorialnuevo.setAlta(Boolean.TRUE);
            editorialDAO.guardarEditorial(editorialnuevo);

            return editorialnuevo;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void eliminaEditorial(Editorial edit) {
        try
        {
            if (edit == null)
            {
                throw new Exception("Editorial no valida");
            }
            editorialDAO.eliminar(edit);
        } catch (Exception e)
        {
            System.out.println("\nLA EDITORIAL NO SE PUDO BORRAR");
            //System.out.println(e.getMessage());
        }

    }

    public void modificarEditorial(String nombre, String nuevonombre) {
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }
            if (nuevonombre == null || nuevonombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }

            List<Editorial> edit = editorialDAO.buscarPorNombre(nombre);

            for (Editorial aux : edit)
            {
                if (aux.getNombre().equals(nombre))
                {
                    aux.setNombre(nuevonombre);
                    editorialDAO.modificarEditorial(aux);
                }
            }

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public List<Editorial> buscaTodo() {
        List<Editorial> buscado = null;

        try
        {
            buscado = editorialDAO.listarTodos();
            return buscado;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public List<Editorial> buscaEdit(String nombre) {
        List<Editorial> buscado = null;

        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }

            buscado = editorialDAO.buscarPorNombre(nombre);
            return buscado;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
