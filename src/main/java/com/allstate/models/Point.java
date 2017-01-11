package com.allstate.models;

import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

public class Point {

    static double diffX, diffY;

    private int x, y;
    private static Map<String, Double> details ;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        details = new HashMap<>();
    }
    public static Map<String, Double> getDetails(Point[] points) {
        details.put("slope", getSlope(points));
        details.put("distance", getDistance(points));
        details.put("y-intercept", getYIntercept(points));
        return details;
    }
    public static double getSlope(Point[] points) {
        diffY =  (points[1].getY() - points[0].getY());
        diffX = (points[1].getX() - points[0].getX());
        return diffY/diffX;
    }
    public static double getDistance(Point[] points) {
        return Math.sqrt(diffY * diffY + diffX * diffX);
    }

    public static double getYIntercept(Point[] points) {
        return points[0].getY() - (diffY/diffX) * points[0].getX();
    }
}
