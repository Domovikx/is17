package com.github.domovikx;

public class Task8 {

    public static void main(String[] args) {

        int[][] array = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = Math.toIntExact(Math.round(Math.random() * 9));
            }
        }
        display(array);
    }

    private static void display(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println(array[i][4]);
        }
    }

}
