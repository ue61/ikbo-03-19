package com.company.lab.hw9;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Exception1 exception1 = new Exception1();
        Exception2 exception2 = new Exception2();
        System.out.println("1, 2 or 3?");
        int choose = in.nextInt();
        switch (choose) {
            case 1:
                exception1.exceptionDemo1();
                break;
            case 2:
                exception1.exceptionDemo2();
                break;
            case 3:
                exception2.exceptionDemo();
                break;
        }
    }
}
