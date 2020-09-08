package com.company.lab.hw3;

public class Test {
    Test(){
        Dog dolmatin = new Dolmatin();
        Dog labrador = new Labrador();
        labrador.bark(labrador);
        dolmatin.bark(dolmatin);
        Dish spoon = new Spoon();
        Dish plate = new Plate();
        System.out.println("Spoon is clear? " + spoon.getClear());
        System.out.println("Plate is clear? "+ plate.getClear());
        Furniture chair = new Chair();
        Furniture table = new Table();
        FurnitureShop shop = new FurnitureShop();
        shop.sell(table);
        shop.sell(chair);
    }
}
