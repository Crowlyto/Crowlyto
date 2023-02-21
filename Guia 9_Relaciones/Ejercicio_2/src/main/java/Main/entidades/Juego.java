
package Main.entidades;

import java.util.ArrayList;

/**
 *
 * @author crowl
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver armita;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver armita) {
        this.jugadores = jugadores;
        this.armita = armita;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getArmita() {
        return armita;
    }

    public void setArmita(Revolver armita) {
        this.armita = armita;
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores,Revolver armita){
        this.jugadores=jugadores;
        this.armita=armita;
    }
    public void ronda(){
        Jugador unJugador;
        int maximo=this.jugadores.size(), i=0;
        System.out.println("Posicion Carga "+armita.getPosicionAgua());
        do{
            System.out.println("Posicion Actual "+armita.getPosicionActual());
            unJugador=this.jugadores.get(i);
            if(unJugador.disparo(armita)){
                System.out.println(unJugador.getNombre()+" se mojo");
                break;
            }else{
                System.out.println(unJugador.getNombre()+" no se mojo");
            }
            if(i==maximo-1){
                i=0;
            }else{
                
            }
            i++;
        }while (!unJugador.isMojado());
    }
}
