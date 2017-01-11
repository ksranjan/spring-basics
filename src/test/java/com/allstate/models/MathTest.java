package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldSquareAnInteger() throws Exception {
        int result = Math.square(4);
        assertEquals(16, result);
    }

    @Test
    public void shouldreturnFactorialOfAninteger(){
        int result = Math.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void shouldreturnFibonacciOfAninteger(){
        int result = Math.fibonacci(8);
        assertEquals(21, result);
    }
}