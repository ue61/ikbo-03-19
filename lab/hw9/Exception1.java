package com.company.lab.hw9;

public class Exception1 {
    public void exceptionDemo1() {
        System.out.println( 2 / 0 );
    }
    public void exceptionDemo2() {
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}
