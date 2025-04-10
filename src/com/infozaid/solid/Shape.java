package com.infozaid.solid;

public interface Shape {
    double area();
   // double volume(); because of broke the rule of interface segregation that's why we remove from here and make new Interface
}
