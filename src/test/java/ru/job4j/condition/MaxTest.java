package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int one = 1;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12To2Then12() {
        int one = 12;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To4To3Then5() {
        int one = 5;
        int two = 4;
        int three = 3;
        int result = Max.max(one, two, three);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To20To30To40Then40() {
        int one = 1;
        int two = 20;
        int three = 30;
        int four = 40;
        int result = Max.max(one, two, three, four);
        int expected = 40;
        Assert.assertEquals(result, expected);
    }
}