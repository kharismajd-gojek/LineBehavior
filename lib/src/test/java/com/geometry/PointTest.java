package com.geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void distanceToTestResult() {
        double answer = 0;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);
        assertEquals(answer, point1.distanceTo(point2), 0.0001);
    }
}
