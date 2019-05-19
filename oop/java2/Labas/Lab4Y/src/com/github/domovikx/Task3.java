package com.github.domovikx;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String number = scanner.next();
            switch (number) {
                case "Ноль":
                    System.out.println(0);
                    break;
                case "Один":
                    System.out.println(1);
                    break;
                case "Два":
                    System.out.println(2);
                    break;
                case "Три":
                    System.out.println(3);
                    break;
                case "Четыре":
                    System.out.println(4);
                    break;
                case "Пять":
                    System.out.println(5);
                    break;
                case "Шесть":
                    System.out.println(6);
                    break;
                case "Семь":
                    System.out.println(7);
                    break;
                case "Восемь":
                    System.out.println(8);
                    break;
                case "Девять":
                    System.out.println(9);
                    break;
                default:
                    System.out.println("Такой цифры не знаю");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Введено не число");
        }
    }

}
