package com.company;

public class BoxTest {
    public static void main(String[] args) {
        Box bx = new Box(13.3, 2.8, 8.3);

        bx.setDimension(2.0, 6.3, 12.3);

        System.out.println("BOX DIMENSIONS: " + "\n" +
                "Length: " + bx.getLength() + "\n" +
                "Width: " + bx.getWidth() + "\n" +
                "Height: " + bx.getHeight() + "\n" +
                "Area: " + bx.getArea() + "\n" +
                "Volume: " + bx.getVolume());

    }
}
