package com.design.factory;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/18/13
 * Time: 12:38 PM
 * To change this template use File | Settings | File Templates.
 */

/*HatchBackCar.java is concrete implementation of car type HatchBack*/

public class HatchBackCar extends Car {

    public HatchBackCar(){
        super(CarType.HATCHBACK);
        buildCar();
    }

    @Override
    protected void buildCar() {
        System.out.println("Building a HatchBack car");
    }
}
