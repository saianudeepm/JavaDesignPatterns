package com.design.prototype;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 12:01 PM
 */

/**
 * Defines interface for the Animal type and extends cloneable so that we can make clones
 * Cloning= copy of the objects but unlike reference copy actual copy of objects in to a diff location
 */
public interface IAnimal extends Cloneable{

    public IAnimal makeClone();
}
