
package tienda.servicios;


import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;


public class FabricanteServicios{
    
    private FabricanteDAO dao;

    public FabricanteServicios() {
        this.dao = new FabricanteDAO();
    }
    
//    public void crearFabricante(String nombre){
//        try {
//            if(codigo==null||codigo.trim().isEmpty()){
//                throw new Exception("Debe indicar el codigo de fabricante");
//            }
//            if(nombre==null||nombre.trim().isEmpty()){
//                throw new Exception("Debe indicar un nombre");
//            }
//            if(dao.buscarFabricantePorNombre(nombre)!=null){
//                throw new Exception("Ya existe un fabricante con ese codigo");
//            }
//            
//            Fabricante fabrica=new Fabricante();
//            
//            fabrica.setNombre(nombre);
//            dao.guardarFabricante(fabrica);
//        } catch (Exception e) {
//        }
//    }
    
    public void mostrarFabricante(){
        try {
            
        } catch (Exception e) {
        }
    }
}
