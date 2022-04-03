package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl1;
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 4, 10, 8);
        System.out.println("result (10, 5) to (8, 4) " + result);
    }
}
