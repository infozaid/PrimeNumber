package com.infozaid.solid;


import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator iAreaCalculator;

    public ShapesPrinter(IAreaCalculator iAreaCalculator) {
        this.iAreaCalculator = iAreaCalculator;
    }

    public String json(List<Shape> shapes){
        return "{Shapesum: %s}".formatted(iAreaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return "Shape_sum , %s".formatted(iAreaCalculator.sum(shapes));
    }
}
