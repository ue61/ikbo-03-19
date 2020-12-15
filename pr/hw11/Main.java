package com.company.pr.hw11;

public class Main {
    public static void main(String[] args) {

        AbstractQueue<Integer> queue = new ArrayQueue<>();

        queue.add(16);
        queue.add(5);
        queue.add(2001);
        System.out.println(queue);

        System.out.println("value: " + queue.value());
        System.out.println(queue);

        System.out.println("peek: " + queue.peek());
        System.out.println(queue);

        System.out.println("poll: " + queue.poll());
        System.out.println(queue + "\n");

        queue = new LinkedQueue<>();

        queue.add(777);
        queue.add(666);
        queue.add(-11);
        System.out.println(queue);

        System.out.println("value: " + queue.value());
        System.out.println(queue);

        System.out.println("peek: " + queue.peek());
        System.out.println(queue);

        System.out.println("poll: " + queue.poll());
        System.out.println(queue);
    }
}
