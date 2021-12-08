package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan187Then100() {
        short in = 187;
        double expected = 100.05f;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman181Then81and65() {
        short in = 181;
        double expected = 81.65f;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}