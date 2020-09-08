package com.company.lab.hw4;

public class Main {
    public static void main (String[] args){
        Priceable pen = new Pen(10);
        Priceable boots = new Boots(1000);
        Priceable personalComputer = new PersonalComputer(100000);
        System.out.println(pen.getPrice());
        System.out.println(boots.getPrice());
        System.out.println(personalComputer.getPrice());
    }
}
