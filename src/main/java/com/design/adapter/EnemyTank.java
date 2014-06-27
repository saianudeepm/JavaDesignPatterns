package com.design.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 1:46 PM
 */

/**
 * This is a type of Enemy Attacker
 */
public class EnemyTank implements IEnemyAttacker {

    private int id;

    public EnemyTank(){
        this.id=System.identityHashCode(this);
    }
    @Override
    public void fireWeapon() {
        System.out.println(id+": Enemy Tank fired a weapon");
    }

    @Override
    public void driveForward() {
        System.out.println(id+ ": Enemy Tank Driving forward");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(id+ ": Enemy Tank now has assigned the driver: "+driverName);
    }
}
