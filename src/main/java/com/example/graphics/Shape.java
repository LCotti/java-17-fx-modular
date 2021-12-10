package com.example.graphics;

abstract class Shape {
    private static double x;
    private static double y;

    abstract double computeArea();

    abstract double computeCircumference();

    //Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    //Setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Konstruktor
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //toString
    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
