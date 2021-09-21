package com.geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void distanceToTestResult1() {
        double answer = 0;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);
        assertEquals(answer, point1.distanceTo(point2), 0.0001);
    }

    @Test
    public void distanceToTestResult2() {
        double answer = 5;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        assertEquals(answer, point1.distanceTo(point2), 0.0001);
    }

    @Test
    public void distanceToTestNull() {
        double answer = 0;
        Point point = new Point(0, 0);
        assertEquals(answer, point.distanceTo(null), 0.0001);
    }
}
