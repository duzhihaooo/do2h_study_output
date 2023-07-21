package com.dodo.practice.test.superTest;

public class Rectangular {
    private double length;
    private double width;

    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}