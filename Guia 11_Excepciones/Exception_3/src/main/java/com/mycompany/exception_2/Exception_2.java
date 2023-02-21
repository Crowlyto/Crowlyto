package com.mycompany.exception_2;

import com.mycompany.exception_2.entidad.DivisionNumero;
import com.mycompany.exception_2.servicio.ServicioNumero;
import java.util.Scanner;

public class Exception_2 {

    public static void main(String[] args) {
//        ServicioNumero ser=new ServicioNumero();
//        ser.ingresodatos();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Ingrese un numero");
            String uno = leer.next();
            System.out.println("Ingrese otro numero");
            String dos = leer.next();
            DivisionNumero one = new DivisionNumero();
            one.setOne(Integer.parseInt(uno));
            one.setTwo(Integer.parseInt(dos));
            one.division();
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un numero boludo");
        }

    }

}
