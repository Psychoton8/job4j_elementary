package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {1, 2, 3, 4, 5, 6};
        int el = 8;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
        }

    @Test
    public void whenDiapasonHas10Then1() {
        int[] data = new int[] {5, 10, 2, 3, 47, 4, 1, 1, 4};
        int el = 10;
        int start = 0;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}