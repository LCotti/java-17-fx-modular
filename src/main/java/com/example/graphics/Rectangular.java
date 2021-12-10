package com.example.graphics;

public class Rectangular extends Shape{
    double width;
    double height;

    //Getter
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    //Setter
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double computeArea() {
        return (height*width);
    }

    @Override
    double computeCircumference() {
        return (2*height + 2*width);
    }

    //Konstruktor
    public Rectangular(double width, double height) {
        super(width,height);
        this.width = width;
        this.height = height;
    }

    //toString
    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
