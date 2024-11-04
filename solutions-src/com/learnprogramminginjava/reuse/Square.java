package com.learnprogramminginjava.reuse;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(int shapeId) {
        super(shapeId);
    }

    public Square(int length, int height) {
        super(length, height);
        System.out.println("Square Init");
    }

    public Square(int shapeId, int length, int height) {
        super(shapeId, length, height);
    }

    public static void main(String[] args) {
        Square square = new Square(100, 100);
        System.out.println(square);
    }

    @Override
    public String toString() {
        return "Square{" +
                "xy=" + xy +
                ", width=" + width +
                ", height=" + height +
                ", sides=" + sides +
                ", shapeId=" + shapeId +
                '}';
    }
}
