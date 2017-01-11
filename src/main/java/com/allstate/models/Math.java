package com.allstate.models;

import java.util.stream.Stream;

public class Math {
    public static int square(int i) {
        return i*i;
    }

    public static int factorial(int i) {
        return Stream.iterate(1, n -> n+1).limit(i).reduce(1,(acc, cur) -> acc * cur);
    }
}
