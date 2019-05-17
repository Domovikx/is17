package com.github.domovikx;

import java.text.MessageFormat;

public class Rectangle {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(int width, int height) {
        this(0, 0, width, -height);
    }

    public Rectangle() {
        this(0, 0, 0, 0);
    }

    public void move(int dx, int dy) {
        x1 += dx;
        x2 += dx;

        y1 += dy;
        y2 += dy;
    }

    public Rectangle minSquare(Rectangle other) {
        return this.square() < other.square() ? this : other;
    }

    @Override
    public String toString() {
        return MessageFormat.format("x1: {0}, y1: {1}, x2: {2}, y2: {3}", x1, y1, x2, y2);
    }

    private int square() {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

}
