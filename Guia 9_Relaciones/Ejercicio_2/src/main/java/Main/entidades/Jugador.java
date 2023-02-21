
package Main.entidades;

/**
 *
 * @author crowl
 */
public class Jugador {
    
    private static int id=0;
    private String nombre;
    private boolean mojado;

    public Jugador() {
        id++;
        nombre="Jugador "+id;
        mojado=false;
    }

    public Jugador(String nombre, boolean mojado) {
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Jugador.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    public boolean disparo(Revolver revo){
        boolean mojar= revo.mojar();
        revo.siguienteChorro();
        if (mojar){
            mojado=true;
        }
        return mojar;
    }
    
}
