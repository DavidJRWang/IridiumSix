package com.davidwang.iridiumsix;

import java.util.TreeMap;

public class Distance extends Unit{
//    private static final double METRE = 1;
//    private static final double KILOMETRE = 1000;
//    private static final double CENTIMETRE = 0.1;
//    private static final double MILLIMETRE = 0.01;
//
//    //may need adjustment for precision
//    private static final double MILE = 0.000621371;
//    private static final double YARD = 1.09361296;
//    private static final double FOOT = 3.2808388799999997;
//    private static final double INCH = 39.370066559999997935;


    /*
    Questions:
    should this be a static class?
    how do we handle which unit we call?
        maybe it's all one unit class and we store the different types within?
    [insert doubts that this is the cleanest solution]
     */

    private static final TreeMap<String, Double> myMap;
    static {
        myMap = new TreeMap<>();
        myMap.put("metre", 1.0);
        myMap.put("kilometre", 1000.0);
        myMap.put("centimetre", 0.1);
        myMap.put("millimetre", 0.01);

        myMap.put("mile", 0.000621371);
        myMap.put("yard", 1.09361296);
        myMap.put("foot", 3.2808388799999997);
        myMap.put("inch", 39.370066559999997935);
    }

    public Distance() {
        super();
        setType("metre");
    }

    public Distance(String input) {
        this();
        setType(input);
    }

    public double convert(String inputTo, double amount) {
        // divide by 'from' (aka type) to convert into 1.0 unit, then multiply by 'to' unit
        // amount / map[type] * map[to];

        return amount / myMap.get(getType()) * myMap.get(inputTo);
    }
}
