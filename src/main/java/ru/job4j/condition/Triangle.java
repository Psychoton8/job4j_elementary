package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        if((ab + ac) > bc && (ab + bc) > ac && (ac + bc) > ab) {
            System.out.println("Треугольник существует.");
        } else {
                System.out.println("Треугльник не существует.");
            }
        return false;
        }

    public static void main(String[] args) {
        Triangle.exist(10,20, 30);
    }
}
