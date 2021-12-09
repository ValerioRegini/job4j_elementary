package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP10K3Square4and69() {
        double expected = 4.69;
        int p = 10;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K4Square2and57() {
        double expected = 2.57;
        int p = 8;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP49K26Square21and4() {
        double expected = 21.4f;
        int p = 49;
        double k = 26;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}