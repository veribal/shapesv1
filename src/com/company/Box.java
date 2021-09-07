package com.company;

public class Box {
    private double length;
    private double width;
    private double height;
    private double area;
    private double volume;

    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public void setDimension(double l, double w, double h)
    {
        this.area = (2 * (h * w)) + (2 * (h * l)) + (2 * (w * l));
        this.volume = l * w * h;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight () {
        return height;
    }

    public double getArea () {
        return area;
    }

    public double getVolume () {
        return volume;
    }

}

