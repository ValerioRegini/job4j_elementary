package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax0ToMin6Then0() {
        int left = 0;
        int right = -6;
        int result = Max.max(left, right);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5ToMin4Then5() {
        int left = 4;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenBoth12Then12() {
        int left = 12;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }
}