package com.infozaid.solid;

import java.util.List;

public class AreaCalculator implements IAreaCalculator{

   /* public int sum(List<Object> shapes){
        int sum = 0;

        for(int i=0; i<shapes.size();i++){
            Object shape = shapes.get(i);
            if(shape instanceof Square){
                sum+= Math.pow(((Square) shape).getLength(),2);
            }
            if(shape instanceof Circle){
                sum+=Math.PI*Math.pow(((Circle) shape).getRadius(),2);
            }
            if(shape instanceof Cube){

            }
        }
        return sum;
    }*/


        int sum = 0;
        public int sum(List<Shape> shapes){
            int sum = 0;

            for(int i=0; i<shapes.size();i++){
                sum+=shapes.get(i).area();
            }
            return sum;
        }

}
