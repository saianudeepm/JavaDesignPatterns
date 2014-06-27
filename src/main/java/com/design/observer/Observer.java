package com.design.observer;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/21/14
 * Time: 5:26 PM
 */

//lets say we are passing updates for 3 stocks
public interface Observer {

public void update(double ibmPrice, double aaplPrice, double googPrice);

}
