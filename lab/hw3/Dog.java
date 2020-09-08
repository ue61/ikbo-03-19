package com.company.lab.hw3;

public abstract class Dog {
    protected String color;
    protected String name;
    protected int potentialAge;
    public void bark(Dog dog){
        System.out.println(dog.name +" Woof");
    }
}
