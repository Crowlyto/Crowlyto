
package com.mycompany.exception_2.entidad;


public class DivisionNumero {
    protected Integer one;
    protected Integer two;

    public DivisionNumero() {
    }

    public DivisionNumero(Integer one, Integer two) {
        this.one = one;
        this.two = two;
    }

    public Integer getOne() {
        return one;
    }

    public void setOne(Integer one) {
        this.one = one;
    }

    public Integer getTwo() {
        return two;
    }

    public void setTwo(Integer two) {
        this.two = two;
    }
    
    public void division (){
        try{
            System.out.println((this.one/this.two)); 
            
        }catch(ArithmeticException e){
            System.out.println("Chorlito no se puede dividir por cero");
        }
    }
}
