package crowlyto.relaciones_extra_1.servicios;

import crowlyto.relaciones_extra_1.entidades.Perro;
import crowlyto.relaciones_extra_1.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAdopcion {

    ArrayList<Persona> adoptantes = new ArrayList();
    ArrayList<Perro> disponibles = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPerro() {
        Perro p1 = new Perro("Manuel", "Boxer", 1, "Mediano");
        Perro p2 = new Perro("Toby", "Caniche", 3, "Pequeño");
        Perro p3 = new Perro("Layla", "Ovejero Aleman", 6, "Mediano");
        Perro p4 = new Perro("Sofia", "Gran Danes", 3, "Grande");
        Perro p5 = new Perro("Wang", "Mastiff Tibetano", 4, "Grande");
        Perro p6 = new Perro("Odor", "Bulldog Frances", 2, "Pequeño");
        disponibles.add(p1);
        disponibles.add(p2);
        disponibles.add(p3);
        disponibles.add(p4);
        disponibles.add(p5);
        disponibles.add(p6);
    }

    public void crearPersona() {
        System.out.println("BIENVENIDO AL SISTEMA DE ADOPCIONES");
        String opcion = "";
        do {
            Persona pers = new Persona();
            Perro aux;
            System.out.println("Ingrese su nombre");
            pers.setNombre(leer.next());
            System.out.println("Ingrese su apellido");
            pers.setApellido(leer.next());
            System.out.println("Ingrese su edad");
            pers.setEdad(leer.nextInt());
            System.out.println("Ingrese su DNI");
            pers.setDNI(leer.next());
            mostrarPerros();
            System.out.println("---------------\n"
                    + "Desea Adoptar un perro S/N\n"
                    + "---------------");
            String condi=leer.next();
            if (condi.equalsIgnoreCase("S")){
            aux=(elejir());
            adoptantes.add(pers);
            System.out.println("---------------\n"
                    + "FELICIDADES ADOPTO UN PERRO");
            }else if (condi.equalsIgnoreCase("S")){
                System.out.println("LAMENTAMOS NO TENER UNA PERRO PARA USTED");
            }else{
                System.out.println("Ingrese Opcion Correcta");
                continue;
            }
            System.out.println("Desea recibir otro adoptante?");
            opcion=leer.next();
        } while (opcion.equalsIgnoreCase("S")||disponibles.size()==0);
    }
    public void mostrarPerros(){
        int i=1;
        System.out.println("LISTA DE PERROS EN ADOPCION");
         System.out.println("---------------");
        for (Perro aux : disponibles) {
            System.out.println("Perro N° "+i);
            System.out.println(aux);
            System.out.println("---------------");
            i++;
        }
    }
    public Perro elejir(){
        System.out.println("ELIJA UN PERRO PARA ADOPTAR");
        int opcion=leer.nextInt();
        Perro p1;
        try{
        switch(opcion){
            case 1:
                p1=disponibles.get(0);
                disponibles.remove(0);
                return p1;
            case 2:
                p1=disponibles.get(1);
                disponibles.remove(1);
                return p1;
            case 3:
                p1=disponibles.get(2);
                disponibles.remove(2);
                return p1;
            case 4:
                p1=disponibles.get(3);
                disponibles.remove(3);
                return p1;
            case 5:
                p1=disponibles.get(4);
                disponibles.remove(4);
                return p1;
            case 6:
                p1=disponibles.get(5);
                disponibles.remove(5);
                return p1;
        }
        }catch(Exception e){
            System.out.println("No existe el perro solicitado Perro");
        }
        return null;
    }
    public void mostrarAdoptantes(){
        System.out.println("---------------\nLISTA FINAL DE ADOPCIONES");
        for (Persona aux : adoptantes) {
            System.out.println(aux);
            
        }
    }
}
