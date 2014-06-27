package com.design.prototype;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 12:07 PM
 */
public class TestPrototype {
    public static void main(String args[]){

        Sheep sally= new Sheep();
        Sheep cloneOfSally = (Sheep)sally.makeClone();
        System.out.println("sally hashcode:"+ System.identityHashCode(sally));
        System.out.println("cloneOfSally hashcode:"+ System.identityHashCode(cloneOfSally));

    }
}
