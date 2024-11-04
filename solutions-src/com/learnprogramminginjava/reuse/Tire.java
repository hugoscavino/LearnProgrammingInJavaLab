package com.learnprogramminginjava.reuse;

public final class Tire {
    private final int size;

    public Tire(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Tire[" + size + "]";
    }
}
