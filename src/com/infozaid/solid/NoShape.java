package com.infozaid.solid;

public class NoShape implements Shape{


    @Override
    public double area() {
        throw new IllegalStateException("Can not calculate area.");
    }


}
