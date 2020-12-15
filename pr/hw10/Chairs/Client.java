package com.company.pr.hw10.Chairs;

public class Client {
    Chair chair;

    public void sit() {
        System.out.println("Sit on " + Chair.class.getName());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
