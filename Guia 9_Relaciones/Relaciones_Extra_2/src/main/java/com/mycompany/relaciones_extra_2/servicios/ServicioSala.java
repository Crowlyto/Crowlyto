package com.mycompany.relaciones_extra_2.servicios;

import com.mycompany.relaciones_extra_2.entidades.Cine;
import com.mycompany.relaciones_extra_2.entidades.Espectador;
import com.mycompany.relaciones_extra_2.entidades.Pelicula;
import com.mycompany.relaciones_extra_2.entidades.Sala;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class ServicioSala {

    ArrayList<Espectador> espectador = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Pelicula> peliculas = new ArrayList();
    Cine salaDia = new Cine();
    Sala sala = new Sala();

    public void listaPeliculas() {
        Pelicula p1 = new Pelicula("El Señor de los Anillos: La comunidad del Anillo", 178, 16, "Peter Jackson");
        Pelicula p2 = new Pelicula("El Señor de los Anillos: Las Dos Torres", 179, 13, "Peter Jackson");
        Pelicula p3 = new Pelicula("El Señor de los Anillos: El Retorno del rey", 200, 13, "Peter Jackson");
        Pelicula p4 = new Pelicula("El Hobbit: Un Viaje Inesperado ", 182, 13, "Peter Jackson");
        Pelicula p5 = new Pelicula("El Hobbit: La desolacion de Smaug", 186, 16, "Peter Jackson");
        Pelicula p6 = new Pelicula("El Hobbit: La Batalla de los Cinco Ejercitos", 164, 17, "Peter Jackson");
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
        peliculas.add(p4);
        peliculas.add(p5);
        peliculas.add(p6);
    }

    public void seleccionPelicula() {
        Pelicula aux;
        int i = 1;
        System.out.println("BIENVENIDO A CINES NON-GADEAS\n"
                + "------------------------\n"
                + "ESTA ES LA CARTELERA DEL DIA");
        for (Pelicula aux1 : peliculas) {
            System.out.println("------------------------");
            System.out.println("N° " + i + " " + aux1.getTitulo());
            i++;
        }
        System.out.println("------------------------\n"
                + "POR FAVOR SELECCIONE LA PELICULA DEL DIA");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                aux = peliculas.get(0);
                salaDia.setPeli(aux);
                System.out.println("------------------------\n"
                        + "USTED HA SELECCIONADO\n"
                        + aux.getTitulo());
                break;
            case 2:
                aux = peliculas.get(1);
                salaDia.setPeli(aux);
                System.out.println("------------------------\n"
                        + "USTED HA SELECCIONADO\n"
                        + aux.getTitulo());
                break;
            case 3:
                aux = peliculas.get(2);
                salaDia.setPeli(aux);
                System.out.println("------------------------\n"
                        + "USTED HA SELECCIONADO\n"
                        + aux.getTitulo());
                break;
            case 4:
                aux = peliculas.get(3);
                salaDia.setPeli(aux);
                System.out.println("------------------------\n"
                        + "USTED HA SELECCIONADO\n"
                        + aux.getTitulo());
                break;
            case 5:
                aux = peliculas.get(4);
                salaDia.setPeli(aux);
                System.out.println("------------------------\n"
                        + "USTED HA SELECCIONADO\n"
                        + aux.getTitulo());
                break;
            case 6:
                aux = peliculas.get(5);
                salaDia.setPeli(aux);
                System.out.println("------------------------\n"
                        + "USTED HA SELECCIONADO\n"
                        + aux.getTitulo());
                break;
        }
    }

    public void crearEspectador() {
        String opcion = "";
        do {
            Espectador aux = new Espectador();
            System.out.println("DATOS DEL ESPECTADOR\n"
                    + "------------------");
            System.out.println("Ingrese su nombre");
            aux.setNombre(leer.next());
            System.out.println("Ingrese su edad");
            aux.setEdad(leer.nextInt());
            System.out.println("Ingrese dinero disponible");
            aux.setDinero(leer.nextDouble());
            if (aux.getEdad() > salaDia.getPeli().getEdadMinima() && aux.getDinero() > salaDia.getEntrada()) {
                espectador.add(aux);
                System.out.println("------------------\n"
                        + "FELICIDADES ENTRADA ADQUIRIDA");
            } else if (aux.getEdad() < salaDia.getPeli().getEdadMinima()) {
                System.out.println("------------------\n"
                        + "LO SENTIMOS,NO TIENE LA EDAD REQUERIDA PARA VER LA PELICULA ");
            } else if (aux.getDinero() < salaDia.getEntrada()) {
                System.out.println("------------------\n"
                        + "LO SENTIMOS,NO POSEE DINERO SUFICIENNTE PARA VER LA PELICULA ");
            }
            System.out.println("------------------\n"
                    + "¿HAY MAS ESPECTADORES EN LA FILA? S/N");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
        salaDia.setEspectador(espectador);
    }

    public void llenarSala() {
        sala.setPeli(salaDia.getPeli());
        sala.setEspectadores(espectador);
        Random rand = new Random();
        String letra = "";
        for (int i = 0; i < espectador.size(); i++) {
            int fila = rand.nextInt(8), colum = rand.nextInt(6);
            switch (colum) {
                case 0:
                    letra = "A";
                case 1:
                    letra = "B";
                case 2:
                    letra = "C";
                case 3:
                    letra = "D";
                case 4:
                    letra = "E";
                case 5:
                    letra = "F";

            }
            if(!sala.getSillas()[fila][colum].contentEquals(fila+letra+"X")){
                sala.getSillas()[fila][colum]=fila+letra+"X";
                System.out.println("Asiento Asignado");
                
            }else{
                System.out.println("Buscando lugar vacio....");
                i=i-1;
            }

        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("|"+sala.getSillas()[i][j]);
            }
            System.out.println("|");
        }
    }
}
