package com.company.lab.hw7;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Hello");
        if (arrList.contains("Hello")){
            System.out.println("Oh, hi mark");
        }
        arrList.remove("Hello");
        if(!arrList.contains("Hello")){
            System.out.println("Bye");
        }

    }
}
