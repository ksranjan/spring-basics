package com.allstate.models;

import java.util.List;
import java.util.stream.Collectors;

public class Triangle {
    private int height;
    private int width;

    public static List<Double> area(List<Triangle> triangles){
        return triangles.stream().map(triangle -> triangle.height * triangle.width * 0.5).collect(Collectors.toList());
    }
    public Triangle() {
    }

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getArea(){
        return this.height * this.width * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}