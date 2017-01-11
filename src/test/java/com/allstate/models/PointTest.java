package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;


public class PointTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void returnsAMapContainingDetails(){
        Point[] points = {new Point(3,5), new Point(5,6)};
        Map<String, Double> map = Point.getDetails(points);
        assertEquals(0.5, map.get("slope"),0.1);
        assertEquals(2.3, map.get("distance"),0.1);
        assertEquals(3.5, map.get("y-intercept"), 0.1);
    }

}