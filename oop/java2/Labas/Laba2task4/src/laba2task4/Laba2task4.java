/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        /*
        5. Дан массив из целых чисел B(n), где n=1,25. 
        Необходимо упорядочить массив по возрастанию
         */
        List<Integer> sortingArrayListInt = sortingArrayListInt(arrayListInt);
        System.out.println(sortingArrayListInt);

        /*
        6. Дан массив из целых чисел С(n), где n=1,20. 
        Необходимо найти среднее значение и вывести его на консоль.
         */
        double averageNumber = averageNumber(arrayListInt);
        System.out.println(averageNumber);

        /*
        7. Дан массив из целых чисел D(n), где n=1,30. 
        Посчитайте сумму четных и нечетных элементов массива.
         */
        Map<String, Double> sumOddAndEven = sumOddAndEven(arrayListInt);
        System.out.println(sumOddAndEven);
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

    public static List<Integer> sortingArrayListInt(List<Integer> arrayListInt) {
        Collections.sort(arrayListInt);
        return arrayListInt;
    }

    public static double averageNumber(List<Integer> arrayListInt) {
        double sum = 0, averageNumber;
        int quantity = arrayListInt.size();
        for (Integer item : arrayListInt) {
            sum += (double) item;
        }
        averageNumber = sum / quantity;
        return averageNumber;
    }

    public static Map<String, Double> sumOddAndEven(List<Integer> arrayListInt) {
        double sumOdd = 0, sumEven = 0;
        Map<String, Double> sumOddAndEven = new HashMap<>();

        for (Integer item : arrayListInt) {
            if (item % 2 == 0) {
                sumOdd += item;
            } else {
                sumEven += item;
            }
        }
        sumOddAndEven.put("Сумма четных элементов ", sumOdd);
        sumOddAndEven.put("Сумма нечетных элементов ", sumEven);
        return sumOddAndEven;
    }
}
