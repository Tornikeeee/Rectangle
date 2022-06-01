package com.Tadamia;

public class Rectangle extends Figure {
    private double width;
    private double height;

    protected Rectangle() {
        this(3, 4);
    }

    protected Rectangle(double width, double height) {
        super("aquameeen");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    protected double getArea() {
        return super.getArea();
    }

    @Override
    protected double getPerimeter() {
        return super.getPerimeter();
    }


    protected double getArea(double w, double h) {
        return w * h;
    }

    protected double getPerimeter(double w, double h) {
        return 2 * (w + h);
    }
}