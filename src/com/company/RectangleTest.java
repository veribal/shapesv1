package com.company;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle recangle = new Rectangle(2.3, 8.1);

        recangle.setDimension(3.8,8.3);



        System.out.println("RECTANGLE DIMENSIONS: " + "\n" +
                "Length: " + recangle.getLength() + "\n" +
                "Width: " + recangle.getWidth() + "\n" +
                "Area: " + recangle.getArea() + "\n" +
                "Perimeter: " + recangle.getPerimeter());

    }
}
