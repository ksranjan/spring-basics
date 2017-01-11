package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TriangleTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldComputeAreaOfAListOfTriangles() throws Exception {
        Triangle t1 = new Triangle(3, 4);
        Triangle t2 = new Triangle(5, 6);
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(t1);
        triangles.add(t2);
        List<Double> areas = Triangle.area(triangles);
        List<Double> expectedAreas = new ArrayList<>();
        expectedAreas.add(6.0);
        expectedAreas.add(15.0);
        assertEquals(expectedAreas.get(0), areas.get(0), 0.1);
        assertEquals(expectedAreas.get(1), areas.get(1), 0.1);
    }
}