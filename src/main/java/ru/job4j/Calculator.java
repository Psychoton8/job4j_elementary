package ru.job4j;

import static ru.job4j.math.MathFunction.*;

public class Calculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }
    public static double sumSubDiv(double first, double second) {
        return ru.job4j.math.MathFunction.subtraction(first, second)
                + ru.job4j.math.MathFunction.divide(first, second);
    }
    public static double sumAll(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.subtraction(first, second)
                + ru.job4j.math.MathFunction.divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма вычитания и деления: " + sumSubDiv(10, 30));
        System.out.println("Сумма всех операций: " + sumAll(10, 40));


        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}
