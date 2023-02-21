package com.mycompany.exception_2.servicio;

import com.mycompany.exception_2.entidad.DivisionNumero;
import java.util.Scanner;

public class ServicioNumero {

    public void ingresodatos() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        String uno = leer.next();
        System.out.println("Ingrese otro numero");
        String dos = leer.next();
        DivisionNumero one = new DivisionNumero();
        try {
            one.setOne(Integer.parseInt(uno));
            one.setTwo(Integer.parseInt(dos));
            calcular(one);
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un numero boludo");
        }
    }
    public void calcular(DivisionNumero one) throws ArithmeticException{
         try{
            System.out.println((one.getOne()/one.getTwo())); 
        }catch(ArithmeticException e){
            System.out.println("Chorlito no se puede dividir por cero");
            throw e;
            
        }
    }

}
