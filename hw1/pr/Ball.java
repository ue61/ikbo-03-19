package com.company.hw1.pr;

public class Ball {
    Ball(int weight, int size){
        this.weight = weight;
        this.size = size;
    }
    private int weight;
    private int size;
    public int getWeight(){
        return weight;
    }
    public int getSize(){
        return size;
    }
    @Override
    public String toString(){
        return "Вес мяча: " + this.weight + ". Размер мяча равен " + this.size + ".";
    }

}
