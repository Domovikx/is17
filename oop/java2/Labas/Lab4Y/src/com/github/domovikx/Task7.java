package com.github.domovikx;

import java.text.MessageFormat;

public class Task7 {

    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.toIntExact(Math.round(Math.random() * 50));
        }
        display(array);

        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }
        System.out.println(MessageFormat.format("Сумма нечетных: {0}, четных: {1}", sumOdd, sumEven));
    }

    private static void display(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

}
