package com.company.pr.hw7;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class Main {
    public static void main (String[] args){
        System.out.println("First");
        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        String text;
        while (true) {
            System.out.println(" 1) Добавить элемент в стек \n 2) Убрать элемент из стека \n 3) Вывести стек на экран \n 4) Завершить работу со стеком \n");
            int choose = in.nextInt();
            if (choose == 1){
                text = in.nextLine();
                stack.add(text);
            }
            else if (choose == 2){
                stack.pop();
            }
            else if (choose == 3){
                for (int i = 0; i< stack.size(); i++){
                    System.out.println(stack.pop());
                }
            }
            else if (choose == 4){
                break;
            }
        }
        System.out.println();
        System.out.println("Second");
        ArrayQueue<String> queue = new ArrayQueue<String>(5);
        queue.add("hello");
        System.out.println(queue.get(0));
        System.out.println("Third");
        ArrayDeque<String> deque = new ArrayDeque<String>();
        deque.add("hello");
        deque.add("bye");
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println("Пьяница");
        Stack<Integer> firstDeck = new Stack<Integer>();
        Stack<Integer> secondDeck = new Stack<Integer>();
        for (int i = 0; i < 5; i++){
            firstDeck.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++){
            secondDeck.add(in.nextInt());
        }
        int firstCard;
        int secondCard;
        int cnt=0;
        while (cnt != 106){
            cnt++;
            if (firstDeck.empty() || secondDeck.empty())
                break;
            firstCard = firstDeck.pop();
            secondCard = secondDeck.pop();
            if (firstCard > secondCard || (firstCard == 0 && secondCard == 9)){
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            }
            else{
                secondDeck.add(firstCard);
                secondDeck.add(secondCard);
            }
        }
        if(firstDeck.empty()){
            System.out.println("second win");
        }
        else{
            System.out.println("First win");
        }
        if (cnt != 106) {
            System.out.println(cnt);
        }
        else{
            System.out.println("botva");
        }
        in.close();
    }
}
