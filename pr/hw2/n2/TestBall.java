package com.company.pr.hw2.n2;

public class TestBall {
    TestBall(){
        Ball ball = new Ball(1.0, 1.0);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        ball.setX(5.0);
        ball.setY(5.0);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        ball.move(1.0, 1.0);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        System.out.println(ball.toString());
    }
}
