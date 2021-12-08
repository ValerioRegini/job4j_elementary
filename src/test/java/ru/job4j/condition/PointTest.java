package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when10to15then5() {
        double expected = 5f;
        int x1 = 1;
        int y1 = 0;
        int x2 = 1;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to00then3() {
        double expected = 3f;
        int x1 = 3;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to90then7and28() {
        double expected = 7.28f;
        int x1 = 2;
        int y1 = 2;
        int x2 = 9;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMin2Min2to22then5and66() {
        double expected = 5.66f;
        int x1 = -2;
        int y1 = -2;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}