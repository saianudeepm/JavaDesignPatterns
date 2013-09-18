package com.design.factory;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/18/13
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */

/*CarFactory.java is our main class implemented using factory pattern.
It instantiates a car instance only after determining its type.
  */

public class CarFactory {
    public static Car buildCar(CarType model){
        Car car =null;
        switch (model){
            case SEDAN:
                car = new SedanCar();
            break;
            case HATCHBACK:
                car = new HatchBackCar();
            break;
            case SUV:
                car  = new SUVCar();
            break;
            default:
                throw new RuntimeException("please specify correct car type");

        }//swtich close
          return car;
    }
}
