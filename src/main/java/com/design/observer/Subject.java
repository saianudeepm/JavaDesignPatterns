package com.design.observer;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/21/14
 * Time: 5:25 PM
 */
public interface Subject {

public void register(Observer o);
public void unregister(Observer o);
public void notifyObserver();
}
