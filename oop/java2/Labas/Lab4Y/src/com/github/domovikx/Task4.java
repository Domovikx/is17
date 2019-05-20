package com.github.domovikx;

public class Task4 {

    public static void main(String[] args) {

        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.toIntExact(Math.round(Math.random() * 50));
        }
        display(array);

        maxX(array);
        swapElements(array, findMinIndex(array), findMaxIndex(array));

        display(array);
    }

    private static void display(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

    private static void maxX(int[] array) {
        int index = findMaxIndex(array);
        System.out.println("Максимальный элемент: " + array[index]);
    }

    private static void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
