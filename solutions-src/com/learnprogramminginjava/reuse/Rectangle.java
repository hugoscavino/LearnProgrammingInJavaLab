package com.learnprogramminginjava.reuse;

import java.time.LocalDateTime;

public class Rectangle extends Shape{
    // instance initialization
    {
        sides = 4;
    }
    // Initializing at the point of definition
    private final LocalDateTime creationDateTime = LocalDateTime.now();

    protected Coordinate xy;

    protected int width;
    protected int height;

    public Rectangle() {
        shapeId = 100;
    }

    public Rectangle(int shapeId) {
        super(shapeId);
    }

    public Rectangle(int width, int height) {
        // in the constructor
        super(200);
        this.width = width;
        this.height = height;
        System.out.println("width: " + width);
        System.out.println("height: " + height);
    }

    public Rectangle(int shapeId, int width, int height) {
        // in the constructor
        super(shapeId);
        this.width = width;
        this.height = height;
    }

    public Coordinate getCoordinate() {
        // Lazy Initialization
        if (xy == null) {
            xy = new Coordinate(0, 0);
        }
        return xy;
    }

    public  LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void setShapeId(int shapeId) {
        super.setShapeId(shapeId);
        System.out.println("setShapeId is now :" + shapeId);
    }
}
