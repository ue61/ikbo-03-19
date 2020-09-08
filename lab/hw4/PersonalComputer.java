package com.company.lab.hw4;

public class PersonalComputer implements Priceable{
    private int price;
    public PersonalComputer(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
