package com.design.singleton;

/**
 * Created by sai on 12/17/13.
 */
public class Singleton {

    /* This is double checked locking where we synchronize only if we need to create instance*/
    //the volatile keywords ensures that multiple threads see the uniqueInstance variable correctly
    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){

        if(uniqueInstance == null){
          synchronized(Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;

    }
}
