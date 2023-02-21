package Main;

import Main.entidades.Juego;
import Main.entidades.Jugador;
import Main.entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;


public class MainRuleta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese numero de Jugadores");
        int cantjugadores=leer.nextInt();
        ArrayList<Jugador>listaJugadores=new ArrayList<>();
        for (int i=0;i<cantjugadores;i++){
            Jugador jugador=new Jugador();
            listaJugadores.add(jugador);
        }
        Juego nuevoJuego=new Juego();
        Revolver revo=new Revolver();
        revo.llenarRevolver();
        nuevoJuego.llenarJuego(listaJugadores, revo);
        nuevoJuego.ronda();
        System.out.println("Game Over");
    }
    
}
