package com.company.lab.hw4;

public class Boots implements Priceable{
    private int price;
    public Boots(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
