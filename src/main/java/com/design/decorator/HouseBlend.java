package com.design.decorator;

/**
 * Created by sai on 12/17/13.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    public double cost() {
        return 1.89;
    }
}
