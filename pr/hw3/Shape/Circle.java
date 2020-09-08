package com.company.pr.hw3.Shape;

public class Circle extends Shape {
    private double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius  + '\'' +
                ", filled=" + filled + '\'' +
                ", color = " + color +
                '}';
    }
}
