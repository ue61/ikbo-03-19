package com.company.hw1.pr;

public class Book {
    Book(String name, int numOfPages){
        this.name = name;
        this.numOfPages = numOfPages;
    }
    private String name;
    private int numOfPages;
    public String getName(){
        return name;
    }
    public int getNumOfPages(){
        return numOfPages;
    }
    @Override
    public String toString(){
        return "Название книги: " + this.name + ". Количество страниц: " + this.numOfPages +".";
    }
}
