package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {

        boolean condition = true;
        int result = condition ? left : right;
        System.out.println("Наибольшее число: " + result);
        return result;

    }

    public static void main(String[] args) {
        Max.max(15, 30);
    }
}
