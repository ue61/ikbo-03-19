package com.company.lab.hw8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        try(FileWriter writer = new FileWriter("text.txt", false)){
            String text = in.nextLine();
            writer.write(text);
            //writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        in.close();
    }
}
