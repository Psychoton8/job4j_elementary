package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        a.distance(b);
        double expected = 2.00;
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when11to20then1dot41() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 0);
        a.distance(b);
        double expected = 1.41;
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when22to33then1dot41() {
        Point a = new Point(2, 2);
        Point b = new Point(3, 3);
        a.distance(b);
        double expected = 1.41;
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when80to11then7dot07() {
        Point a = new Point(8, 0);
        Point b = new Point(1, 1);
        a.distance(b);
        double expected = 7.07;
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }
}