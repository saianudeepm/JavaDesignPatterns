package com.design.observer;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/21/14
 * Time: 5:33 PM
 */
public class StockObserver implements Observer {

    private double ibmPrice;


    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;


    public StockObserver(Subject stockGrabber)
    {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer: "+this.observerID);
        stockGrabber.register(this);
    }



    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice= ibmPrice;
        this.aaplPrice=aaplPrice;
        this.googPrice=googPrice;

        printPrices();
    }

    private void printPrices() {
        System.out.println(
                "ibmPrice=" + ibmPrice +
                ", aaplPrice=" + aaplPrice +
                ", googPrice=" + googPrice +
                '}');

    }
}
