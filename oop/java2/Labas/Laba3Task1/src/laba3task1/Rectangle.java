package laba3task1;

public class Rectangle {

    int x1, y1, x2, y2;
    int width, height;

    Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        x1 = 0;
        y1 = 0;
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

    int minSquare(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        width = x2 - x1;
        height = y2 - y1;
        int square = width * height;
        return square;
    }

    int minSquare(int width, int height) {
        this.width = x2 - x1;
        this.height = y2 - y1;
        int square = width * height;
        return square;
    }

    @Override
    public String toString() {
        return "(" + x1 + " " + y1 + "), "
                + "(" + x2 + " " + y2 + ")";
    }
}
