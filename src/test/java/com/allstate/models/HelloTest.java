package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldCreateANewInstanceHello() throws Exception {
        Hello h= new Hello("Hello JUnit");
        assertEquals("Hello JUnit", h.getMessage());
    }

    @After
    public void tearDown() throws Exception {

    }

}
