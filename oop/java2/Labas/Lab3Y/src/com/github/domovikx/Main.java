package com.github.domovikx;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20, -4, -9);
        Rectangle rectangle2 = new Rectangle(10, 20);
        Rectangle rectangle3 = new Rectangle();

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);

        rectangle2.move(4, -8);
        System.out.println(rectangle2);

        System.out.println(rectangle1.minSquare(rectangle2));

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter in color and press Enter: ");
            String in = s.next();
            System.out.print("Enter out color and press Enter: ");
            String out = s.next();
            ColoredRect coloredRect = new ColoredRect();
            coloredRect.draw(in, out);
            System.out.println(coloredRect);
        }
    }

}
