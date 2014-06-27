package com.design.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 1:49 PM
 */

/**
 * The Adapter must provide an alternative action for
 * the the methods that need to be used because
 * EnemyAttacker was implemented.
 * This adapter does this by containing an object
 * of the same type as the Adaptee (EnemyRobot)
 * All calls to EnemyAttacker methods are sent
 * instead to methods used by EnemyRobot
 */
public class EnemyRobotAdapter implements IEnemyAttacker{

    private EnemyRobot enemyRobot;

    //constructor
    public EnemyRobotAdapter(EnemyRobot enemyRobot){
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        this.enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        this.enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        this.enemyRobot.reactToHuman(driverName);
    }
}
