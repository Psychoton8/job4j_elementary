package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert5000RblThen83dot3333Dlr() {
        float in = 5000;
        float expected = (float) 83.333336;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void whenConvert7352RblThen122dot53333Dlr() {
        float in = 7352;
        float expected = (float) 122.53333;
        float out = Converter.rubleToDollar(in);
        float eps =0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert0RblThen0Dlr() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        float eps =0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}