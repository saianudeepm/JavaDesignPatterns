package com.design.factory;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/18/13
 * Time: 12:37 PM
 * To change this template use File | Settings | File Templates.
 */

/*SUVCar.java is concrete implementation of car type SUVCar*/

public class SUVCar extends Car {
    SUVCar(){
        super(CarType.SUV);
        buildCar();
    }
    @Override
    protected void buildCar() {
        System.out.println("Building SUV car");
    }
}
