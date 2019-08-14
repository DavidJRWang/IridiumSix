package com.davidwang.unitconverter;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

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

    private static final Map<String, Double> myMap;
    static {
        Map<String, Double> aMap = new Map<String, Double>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(@androidx.annotation.Nullable Object key) {
                return false;
            }

            @Override
            public boolean containsValue(@androidx.annotation.Nullable Object value) {
                return false;
            }

            @androidx.annotation.Nullable
            @Override
            public Double get(@androidx.annotation.Nullable Object key) {
                return null;
            }

            @androidx.annotation.Nullable
            @Override
            public Double put(@androidx.annotation.NonNull String key, @androidx.annotation.NonNull Double value) {
                return null;
            }

            @androidx.annotation.Nullable
            @Override
            public Double remove(@androidx.annotation.Nullable Object key) {
                return null;
            }

            @Override
            public void putAll(@androidx.annotation.NonNull Map<? extends String, ? extends Double> m) {

            }

            @Override
            public void clear() {

            }

            @androidx.annotation.NonNull
            @Override
            public Set<String> keySet() {
                return null;
            }

            @androidx.annotation.NonNull
            @Override
            public Collection<Double> values() {
                return null;
            }

            @androidx.annotation.NonNull
            @Override
            public Set<Entry<String, Double>> entrySet() {
                return null;
            }
        };
        aMap.put("metre", 1.0);
        myMap = Collections.unmodifiableMap(aMap);
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
