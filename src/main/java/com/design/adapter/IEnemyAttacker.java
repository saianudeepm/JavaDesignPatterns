package com.design.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 1:45 PM
 */

/**
 * This is the Enemy Attacker interface that Client adheres to
 */
public interface IEnemyAttacker {
    public void fireWeapon();
    public void driveForward();
    public void assignDriver(String driverName);

}
