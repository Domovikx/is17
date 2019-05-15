/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Zver
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        3. Задание обратное первому: при вводе слов, обозначающих цифры от 0 до
        9 - отображать их числовое значение. Например, при вводе слова
        "девять" - отображать в консоле цифру 9. (Информацию о работе со строками вы
        найдете на следующих страницах).   
         */
        String str = scan();
        textToNumber(str);
    }

    public static String scan() {
        Scanner in = new Scanner(System.in, "Cp1251");
        System.out.print("Enter : ");
        String input = in.next();
//        System.out.println("Your input is: " + input);
        return input;
    }

    public static void textToNumber(String str) {
        Map<Integer, String> words = new HashMap<>();
        words.put(1, "Один");
        words.put(2, "Два");
        words.put(3, "Три");
        words.put(4, "Четыре");
        words.put(5, "Пять");
        words.put(6, "Шесть");
        words.put(7, "Семь");
        words.put(8, "Восемь");
        words.put(9, "Девять");
        words.put(10, "Десять");

        for (int key : words.keySet()) {
            String val = words.get(key);

            if (str.equals(val)) {
//                System.out.println(val);
                System.out.println("Ваше число: " + key);
                break;
            }
        }
    }

}
