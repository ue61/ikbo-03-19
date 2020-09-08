package com.company.pr.hw3.Shape;

public class Square extends Rectangle {
    public Square(double side) {
        super(side,side);
    }
    public Square(){}

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return width;
    }
    public void setSide(double side){
        this.length = side;
        this.width = side;
    }
}
