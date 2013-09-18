package com.design.factory;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/18/13
 * Time: 12:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestFactoryPattern {
    public static void main(String args[]){
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.HATCHBACK));
        System.out.println(CarFactory.buildCar(CarType.SUV));
    }

}
