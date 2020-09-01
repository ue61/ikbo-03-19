package com.company.hw1.pr;

import com.company.hw1.pr.Ball;
import com.company.hw1.pr.Book;
import com.company.hw1.pr.Dog;

public class Test {
    Test() {
        Dog dog = new Dog("Murzik", 10);
        Ball ball = new Ball(1, 10);
        Book book = new Book("Book of life", 123);
        System.out.println(dog);
        System.out.println(ball);
        System.out.println(book);
    }
}
