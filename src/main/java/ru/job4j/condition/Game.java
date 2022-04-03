package ru.job4j.condition;

public class Game {
    public static void menu(String name1) {
        if ("super mario".equals(name1)) {
            System.out.println("Start - super mario");
        }
        if ("tanks".equals(name1)) {
            System.out.println("Start - tanks");
        }
        if ("tetris".equals(name1)) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
