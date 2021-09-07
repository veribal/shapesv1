package com.company;

public class Rectangle {

    private double perimeter;
    private double area;
    private double width;
    private double length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength () {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea () {
        return area;
    }

    public double getPerimeter () {
        return perimeter;
    }

    public void setDimension(double length, double width)
    {
        this.perimeter = 2 * (length + width);
        this.area = length * width;
    }
}