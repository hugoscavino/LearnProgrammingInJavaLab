package com.learnprogramminginjava.reuse;

public class Shape {
    protected int sides;
    protected int shapeId;

    public Shape() {
        this.shapeId = -1;
    }

    public Shape(int shapeId) {
        this.shapeId = shapeId;
        System.out.println("shape id: " + shapeId);
    }

    public int getShapeId() {
        return shapeId;
    }

    public void setShapeId(int shapeId) {
        this.shapeId = shapeId;
    }
}
