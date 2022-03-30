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
        float in1 = 5000;
        float expected1 = (float) 83.333336;
        float out1 = Converter.rubleToDollar(in1);
        float eps1 = 0.0001f;
        Assert.assertEquals(expected1, out1, eps1);

    }
    @Test
    public void whenConvert7352RblThen105dot02857Dlr() {
        float in2 = 7352;
        float expected2 = (float) 105.02857;
        float out2 = Converter.rubleToDollar(in2);
        float eps2 =0.0001f;
        Assert.assertEquals(expected2, out2, eps2);
    }
    @Test
    public void whenConvert0RblThen0Dlr() {
        float in3 = 0;
        float expected3 = 0;
        float out3 = Converter.rubleToDollar(in3);
        float eps3 =0.0001f;
        Assert.assertEquals(expected3, out3, eps3);
    }
}