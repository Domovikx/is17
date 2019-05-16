/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2task9;

/**
 *
 * @author Zver
 */
public class Laba2task9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    9. Даны 5 строк s1, s2, s3, s4 и s5, на основе условия: 
//    если строка s4 равна строке s5, нужно сложить строки s1 и s2, 
//    иначе нужно сложить строки s1 и s3       
        String s1 = "s1 ", s2 = "s2 ",
                s3 = "s3 ", s4 = "s4 ",
                s5 = "s5 ", str;

        if (s4.equals(s5)) {
            str = s1 + s2;
        } else {
            str = s1 + s3;
        }
        System.out.println(str);
    }
}
