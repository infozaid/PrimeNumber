package com.infozaid.solid;

import java.util.List;

public class Main {

    public static void main(String[] args){
        IAreaCalculator areaCalculator = new AreaCalculator();

        Circle circle = new Circle(10);
        Square square = new Square(10);
     //   NoShape noShape = new NoShape();
        Cube cube = new Cube();
        List<Shape> shapes = List.of(circle,square,cube);
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
        int sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));
    }
}
