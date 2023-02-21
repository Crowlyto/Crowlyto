
package tienda;

import java.util.logging.Logger;
import java.util.logging.Level;
import tienda.persistencia.FabricanteDAO;
import tienda.servicios.FabricanteServicios;

public class Ejercicio_1 {

    public static void main(String[] args) {
       FabricanteServicios fab=new FabricanteServicios();
        try {
            //fab.crearFabricante("Nicolas");
           
            
        } catch (Exception e) {
            Logger.getLogger(Ejercicio_1.class.getName()).log(Level.SEVERE,null,e);
            
        }
    }
}
