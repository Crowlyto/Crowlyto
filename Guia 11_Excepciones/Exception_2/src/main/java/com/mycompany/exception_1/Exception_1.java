package com.mycompany.exception_1;

import java.util.ArrayList;

public class Exception_1 {

    public static void main(String[] args) {
        //ArrayList<Integer> pepe = new ArrayList();
        int[]pepe=new int[10];
        int cont = 1;
        for (int i = 0; i < 10; i++) {
            //pepe.add(cont);
            pepe[i]=cont;
            cont++;
        }
        try {
            for (int i = 0; i <= pepe.length; i++) {
                System.out.println(pepe[i]);
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Te fuiste de mambo");
        }finally{
            System.out.println("Aaron mamon");
        }

    }
}
