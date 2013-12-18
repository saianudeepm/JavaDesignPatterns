package com.design.decorator;

/**
 * Created by sai on 12/17/13.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}