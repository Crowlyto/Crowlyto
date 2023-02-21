
package crowlyto.relaciones_extra_1;

import crowlyto.relaciones_extra_1.servicios.ServicioAdopcion;

public class Main {

    public static void main(String[] args) {
       ServicioAdopcion serv=new ServicioAdopcion();
       serv.crearPerro();
       serv.crearPersona();
       serv.mostrarAdoptantes();
             
    }
    
}
