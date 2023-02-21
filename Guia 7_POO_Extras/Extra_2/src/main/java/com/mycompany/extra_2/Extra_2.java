package com.mycompany.extra_2;
import com.mycompany.extra_2.Atributos.Puntos;
import com.mycompany.extra_2.Servicios.Servicio;
public class Extra_2 {
    public static void main(String[] args) {
        Servicio serv=new Servicio();
        Puntos punt=serv.definirPuntos();
        serv.Distancia(punt);
    }
}
