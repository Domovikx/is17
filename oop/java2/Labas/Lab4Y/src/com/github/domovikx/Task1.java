package com.github.domovikx;

public class Task1 {

    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum += 1.0 / (i % 2 != 0 ? i : -i);
        }
        System.out.println(sum);
    }
}
