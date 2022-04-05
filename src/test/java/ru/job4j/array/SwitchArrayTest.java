package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {7, 8, 77, 88};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 77, 8, 88};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to7() {
        int[] input = {0, 5, 7, 1, 77, 31, 85, 47, 20, 14, 32};
        int source = 1;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 47, 7, 1, 77, 31, 85, 5, 20, 14, 32};
        Assert.assertArrayEquals(expected, result);
    }
}