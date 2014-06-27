package com.design.observer;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/21/14
 * Time: 5:42 PM
 */
public class GrabStocks {

    public static void  main(String args[]){

        //subject
        StockGrabber stockGrabber = new StockGrabber();

        //observer
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(1923);
        stockGrabber.setAaplPrice(677);
        stockGrabber.setGoogPrice(670);
    }
}
