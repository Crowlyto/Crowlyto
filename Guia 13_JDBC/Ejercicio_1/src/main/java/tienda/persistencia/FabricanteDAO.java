package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fabrica) throws Exception {
        try {
            if (fabrica == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO fabricante (nombre) VALUES('"  + fabrica.getNombre() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }

    }

    public void modificarFabricante(Fabricante fabrica) {
        try {
            if (fabrica == null) {
                throw new Exception("Debe indicar un fabricante a modificar");
            }
            String sql = "UPDATE fabricante SET"
                    + "codigo='" + fabrica.getCodigo() + "' WHERE nombre= '" + fabrica.getNombre() + "';";
            //la QUERY modifica todos los atributos
            insertarModificarEliminar(sql);
        } catch (Exception e) {
        }
    }

    public void eliminarFabricante(String nombre) {
        try {
            String sql = "DELETE FROM fabricante WHERE nombre= '" + nombre + "';";
            //Borra un fabricante por nombre
            insertarModificarEliminar(sql);
        } catch (Exception e) {
        }

    }

    public Fabricante buscarFabricantePorNombre() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante;";
                    //+ "WHERE nombre='" + nombre + "';";
            consultarBase(sql);
            Fabricante fabrica = null;
            while (resultado.next()) {
                fabrica = new Fabricante();
                fabrica.setCodigo(resultado.getInt(1));
                fabrica.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabrica;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public Collection<Fabricante> listarFabricantes() throws Exception {
        try {
            String sql = "SELECT codigo, nombre FROM fabricante";
            consultarBase(sql);
            Fabricante fabrica = null;
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fabrica = new Fabricante();
                fabrica.setCodigo(resultado.getInt(1));
                fabrica.setNombre(resultado.getString(2));
                fabricantes.add(fabrica);
            }
            desconectarBase();
            return fabricantes;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
