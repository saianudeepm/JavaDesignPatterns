package com.design.decorator;

/**
 * Created by sai on 12/17/13.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    public double cost() {
        return 1.99;
    }
}
