/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2task8;

import java.util.Arrays;

/**
 *
 * @author DomovikX
 */
public class Laba2task8 {

    public static void main(String[] args) {
        int[][] matrix = matrix(3, 5);
        showTable(matrix);
    }

    public static void showTable(int[][] matrix) {
        for (int[] item : matrix) {
            System.out.println(Arrays.toString(item));
        }
    }

    public static int[][] matrix(int row, int col) {
        int min = 0, max = 9;
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = randomNumber(min, max);
            }
        }
        return matrix;
    }

    public static int randomNumber(int min, int max) {
        int randomNumber = min + (int) (Math.random() * (max + 1));
        return randomNumber;
    }
}