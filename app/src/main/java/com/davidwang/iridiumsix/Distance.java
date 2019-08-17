package com.davidwang.iridiumsix;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Distance extends Unit{
// USE A MAP INSTEAD !!
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

    private static final TreeMap<String, Double> myMap;
    static {
        myMap = new TreeMap<>();
        myMap.put("metre", 1.0);
        myMap.put("kilometre", 1000.0);
        myMap.put("centimetre", 1.0);
        myMap.put("millimetre", 1.0);

        myMap.put("mile", 1.0);
        myMap.put("yard", 1.0);
        myMap.put("foot", 1.0);
        myMap.put("inch", 1.0);
    }

    public Distance() {
        super();
        setFrom("metre");
    }

    public Distance(String fromInput) {
        this();
        setFrom(fromInput);
    }

    public int convert(String convertTo) {
        return 0;
    }
}
