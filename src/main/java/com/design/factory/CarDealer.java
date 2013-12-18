package com.design.factory;

/**
 * Created by sai on 12/17/13.
 */
public class CarDealer {
    public static void main(String args[]){

        Car mycar = CarFactory.buildCar(CarType.SEDAN);
        System.out.println(mycar);
    }
}
