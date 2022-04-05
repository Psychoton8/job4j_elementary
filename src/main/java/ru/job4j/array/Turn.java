package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = array.length - 1, number = 0; index >= array.length / 2; index--, number++) {
            int temp = array[number];
            array[number] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
