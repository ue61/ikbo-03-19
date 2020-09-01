package com.company.hw1.pr;

public class Dog {
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    private String name;
    private int age;
    public String name(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "Имя собаки: " + this.name + ". Возраст собаки: " + this.age +".";
    }
}
