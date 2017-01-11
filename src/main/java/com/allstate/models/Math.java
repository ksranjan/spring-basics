package com.allstate.models;

import java.util.stream.Stream;

public class Math {

    static int x = 0;
    static int y = 1;
    static int z;

    public static int square(int i) {
        return i*i;
    }

    public static int factorial(int i) {
        return Stream.iterate(1, n -> n+1).limit(i).reduce(1,(acc, cur) -> acc * cur);
    }

    public static int fibonacci(int i){

        if(i == 0 || i == 1){
            return z;
        } else{
            z = x + y;
            x = y;
            y = z;
            return fibonacci(i-1);
        }
    }
}
