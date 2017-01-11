package com.allstate.controllers;

import com.allstate.models.Point;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PointController {
    @RequestMapping(value = "/point/getdetails", method = RequestMethod.POST)
    public Map<String, Double> getDetails(@RequestBody Point[] points) {
        return Point.getDetails(points);
    }
}
