/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2task4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zver
 */
public class Laba2task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        4. Дан массив из целых чисел A(n), где n = 1,25. 
        Необходимо поменять местами его максимальный и минимальный 
        элемент и вывести отдельно максимальный элемент(с помощью 
        описания нового метода, например maxX()
         */
        List<Integer> arrayListInt = arrayListInt(25, 0, 9);
        System.out.println(arrayListInt);
        List<Integer> changeMaxToMin = changeMaxToMin(arrayListInt);
        System.out.println(changeMaxToMin);
    }

    public static List<Integer> arrayListInt(int items, int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < items; i++) {
            int random = randomNumber(min, max);
            list.add(random);
        }
        return list;
    }

    public static int randomNumber(int min, int max) {
        int randomNumber = min + (int) (Math.random() * (max + 1));
        return randomNumber;
    }

    public static List<Integer> changeMaxToMin(List<Integer> arrayListInt) {
        List<Integer> list = new ArrayList<>();
        int min = arrayListInt.get(0), max = arrayListInt.get(0);
        for (Integer item : arrayListInt) {
            if (item < min) {
                min = item;
            }
            if (item > max) {
                max = item;
            }
        }
        for (Integer item : arrayListInt) {
            if (item == min) {
                list.add(max);
            } else if (item == max) {
                list.add(min);
            } else {
                list.add(item);
            }
        }
        return list;
    }

}
