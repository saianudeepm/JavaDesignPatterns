package com.design.prototype;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 12:02 PM
 */
public class Sheep implements IAnimal {

    public Sheep() {
        System.out.println("Sheep is made");
    }

    //we create the clone of the object here and return it
    @Override
    public IAnimal makeClone() {

        Sheep clonedSheep= null;
        try{
            // Calls the Animal super classes clone()
            // Then casts the results to Sheep

            System.out.println("clone is being made");
            clonedSheep = (Sheep) super.clone();
            return clonedSheep;
        }
        catch (CloneNotSupportedException e){e.printStackTrace();}
        return null;
    }

    @Override
    public String toString(){

        return "Sheep's here :)";
    }

}
