
import java.util.Scanner;

/**
 *
 * @author crowl
 */
/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        int i;
        int j;
        int suma;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese dos valores a sumar");
        i= leer.nextInt();
        j= leer.nextInt();
        suma=i+j;
        System.out.println("La suma de los valores ingresados es de: "+suma);
    }
    
}
