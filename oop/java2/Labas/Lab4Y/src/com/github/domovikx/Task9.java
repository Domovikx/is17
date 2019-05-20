package com.github.domovikx;

import java.text.MessageFormat;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        String[] s = new String[5];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < s.length; i++) {
                System.out.println("Введите строку " + i + ":");
                s[i] = scanner.next();
            }

            if (s[3].equals(s[4])) {
                s[0] = s[0] + s[1];
            } else {
                s[0] = s[0] + s[2];
            }

            for (int i = 0; i < s.length; i++) {
                System.out.println(MessageFormat.format("Строка {0}: {1}", i, s[i]));
            }
        }
    }
}
