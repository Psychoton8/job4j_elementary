package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-5);
    }

    public static void possibleDiv(int number1) {
        if (number1 == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number1 < 0) {
            System.out.println("This is a negative number.");
        }
    }
}
