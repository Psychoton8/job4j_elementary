package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num1) {
        return num1 % 2 == 0;
    }

    public static boolean isPositive(int num1) {
        return num1 > 0;
    }

    public static boolean notEven(int num1) {
        return !isEven(num1);
    }

    public static boolean notPositive(int num1) {
        return !isPositive(num1);
    }

    public static boolean notEvenAndPositive(int num1) {
        return !isEven(num1) && !notPositive(num1);
    }

    public static boolean evenOrNotPositive(int num1) {
        return !notEven(num1) || !isPositive(num1);
    }

}
