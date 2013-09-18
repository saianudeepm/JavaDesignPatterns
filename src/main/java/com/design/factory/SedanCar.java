package com.design.factory;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/18/13
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */

/*SedanCar.java is concrete implementation of car type SEDAN*/

public class SedanCar extends Car {

     SedanCar(){
        super(CarType.SEDAN);
         buildCar();
    }

    @Override
    protected void buildCar() {
        System.out.println("Building Sedan Car");
    }

}
