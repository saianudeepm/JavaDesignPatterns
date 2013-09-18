package com.design.factory;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/18/13
 * Time: 12:24 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Car {

    public Car(CarType model){
        this.model = model;
        makeCommonParts();
    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    private  CarType model = null;

    //one tiem work here irrespective of car type for every car
    private void makeCommonParts(){
        System.out.println("common parts started");
    }
    // Do subclass level processing in this method
    protected abstract void buildCar();

    // this method cannot be overridden cause its static
    public static String whoAmI(){
        return "Car class";
    }

}
