/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
3.1. Создайте класс Rectangle, представляющий прямоугольник, экземпляры
которого обладают четырьмя полями целого типа (x1, y1) (левый верхний угол), (x2,
y2) (правый нижний угол). Для данного класса создать три конструктора, которые
инициализируют поля следующим образом:
 конструктор принимает 4 параметра целого типа и присваивает их значения
полям (x1, y1), (x2, y2);
 конструктор принимает 2 параметра целого типа – ширину и высоту
прямоугольника, а левый верхний угол прямоугольника помещает в координату (0,0);
 конструктор не принимает никаких параметров – создает вырожденный
прямоугольник с координатами углов (0,0) и (0,0).
В классе Rectangle перегрузить метод toString(), выдающий текущее состояние
экземпляра прямоугольника (значение полей). Создать метод move (int dx, int dy),
перемещающий прямоугольник по горизонтали на заданное dx, по вертикали на
заданное dy. Создать метод minSquare (подумать какие входные параметры),
возвращающий прямоугольник с минимальной площадью по сравнению с другим
прямоугольником.
Протестируйте в ней поведение экземпляров класса Rectangle следующим
образом: создайте три объекта Rectangle тремя различными созданными
конструкторами, выведите состояние всех трех объектов. Воспользуйтесь вызовом
функции move(…) с различными значениями параметров для каждого объекта и
выведите новое положение созданных прямоугольников. Протестируйте работу
функции minSquare(…) на одном примере.
 */
package laba3task1;

/**
 *
 * @author DomovikX
 */
public class Laba3Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
}

class Rectangle {

    int x1, y1, x2, y2;
    int width, height;

    Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Rectangle(int width, int height) {
        x1 = 0;
        y1 = 0;
        this.width = width;
        this.height = height;
        x2 = x1 + width;
        y2 = y1 + height;
    }

    Rectangle() {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }

    void currentStateRectangle() {
        System.out.println("x1:" + x1 + " y1:" + y1);
        System.out.println("x2:" + x2 + " y2:" + y2);
    }

    void move(int dx, int dy) {
    }

    void minSquare() {
    }
}
