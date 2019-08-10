package com.davidwang.unitconverter;

public class Distance extends Unit{

    public Distance() {
        super();
        mFrom = "metre";
    }

    public Distance(String fromInput) {
        this();
        mFrom = fromInput;
    }

    public int convert(String convertTo) {
        return 0;
    }
}
