package com.example.graphics;

public class Circle extends Shape {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double x, double y) {
        super(x,y);
        this.radius = radius;
    }

    @Override
    double computeArea() {
        return (radius*radius*Math.PI);
    }

    @Override
    double computeCircumference() {
        return (radius*2*Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
