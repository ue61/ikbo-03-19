package com.company.lab.hw4;

public class Pen implements Priceable{
    private int price;
    public Pen(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
       return price;
    }
}
