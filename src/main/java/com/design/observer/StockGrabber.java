package com.design.observer;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/21/14
 * Time: 5:28 PM
 */
public class StockGrabber implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    private double ibmPrice;
    private double googPrice;
    private double aaplPrice;

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.print("Observer "+ (observerIndex+1) +"deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(ibmPrice,aaplPrice,googPrice);
        }

    }
}
