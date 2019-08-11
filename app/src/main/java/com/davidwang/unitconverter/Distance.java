package com.davidwang.unitconverter;

public class Distance extends Unit{
    private static final double METRE = 1;
    private static final double KILOMETRE = 1000;
    private static final double CENTIMETRE = 0.1;
    private static final double MILLIMETRE = 0.01;

    private static final double MILE = 0.000621371; //may need adjustment for precision
    private static final double YARD = 1.09361296;
    private static final double FOOT = 3.2808388799999997;
    private static final double INCH = 39.370066559999997935;


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
