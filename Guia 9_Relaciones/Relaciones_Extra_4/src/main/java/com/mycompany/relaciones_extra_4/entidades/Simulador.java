package com.mycompany.relaciones_extra_4.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

public class Simulador {

    ArrayList<Alumnos> alumnos = new ArrayList();
    ArrayList<Alumnos> auxAlumnos = new ArrayList(alumnos);

    String[] nombresAleatorios = new String[20];
    int[] dni = new int[20];

    public void crearNombres() {
        String[] nombres = {"Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
            "Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
            "Caritina", "Carlota", "Baltazar"};
        String[] apellidos = {"Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
            "Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
            "Grigalva"};
        for (int i = 0; i < 20; i++) {
            nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
                    + apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
        }
    }

    public void crearDNI() {
        for (int i = 0; i < 20; i++) {
            dni[i] = (int) (Math.random() * (55000000 - 5000000 + 1) - 5000000);
        }
    }

    public void crearAlumnos() {
        for (int i = 0; i < 20; i++) {
            Alumnos aux = new Alumnos();
            aux.setDNI(dni[i]);
            aux.setNombreCompleto(nombresAleatorios[i]);
            aux.setCantidadVotos(0);
            alumnos.add(aux);
        }
    }

    public void mostrarAlumnos() {
        System.out.println("LISTA DE ALUMNOS");
        for (Alumnos aux : alumnos) {
            System.out.println(aux);

        }
        System.out.println("-----------------");
    }

    public HashSet<Alumnos> votacion() {
        Voto v = new Voto();
        Random aleatorio = new Random();
        ArrayList<Alumnos> auxAlumnos = new ArrayList(alumnos);
        for (Alumnos aux : alumnos) {
            auxAlumnos.remove(aux);
            ArrayList<Alumnos> votados = new ArrayList();

            int voto1 = aleatorio.nextInt(auxAlumnos.size());
            int voto2;
            voto2 = aleatorio.nextInt(auxAlumnos.size());
            int voto3 = aleatorio.nextInt(auxAlumnos.size());

            int tam = auxAlumnos.size();

            if (voto1 == voto2) {
                voto2 += 1;
                if (voto2 >= tam) {
                    voto2 -= 2;
                }
            } else if (voto1 == voto3) {
                voto3 += 1;
                if (voto3 >= tam) {
                    voto3 -= 2;
                }
            } else if (voto2 == voto3) {
                voto3 += 1;
                if (voto3 >= tam) {
                    voto3 -= 2;
                }
            } else if (voto3 == voto1) {
                voto1 += 1;
                if (voto1 >= tam) {
                    voto1 -= 2;
                }
            }

            votados.add(auxAlumnos.get(voto3));
            votados.add(auxAlumnos.get(voto2));
            votados.add(auxAlumnos.get(voto1));

            auxAlumnos.get(voto1).incrementaVoto();
            auxAlumnos.get(voto2).incrementaVoto();
            auxAlumnos.get(voto3).incrementaVoto();

            v.setAlumnoQueVoto(aux);//le seteo el alumno que vota al Voto creado
            v.setVotados(votados);//le seteo el arraylist de votados al Voto
            auxAlumnos.add(aux);
            System.out.println(v.toString());//mensajito para saber quien esta votando con el toString de Voto
        }
        HashSet<Alumnos> lista = new HashSet<Alumnos>(auxAlumnos);
        return lista;
    }

    public void recuento() {
        ArrayList<Alumnos> aux2Alumnos = new ArrayList(votacion());
        Collections.sort(aux2Alumnos, votos);
        
    }
    public static Comparator<Alumnos> votos = new Comparator<Alumnos>() {
        @Override
        public int compare(Alumnos a1, Alumnos a2) {
            return a1.getCantidadVotos()-a2.getCantidadVotos();
        }

    };
    
}
