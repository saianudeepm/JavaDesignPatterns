package com.design.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 1:52 PM
 */
public class TestAdapter {

    public static void main(String args[]){
        EnemyTank  enemyTank = new EnemyTank();
        enemyTank.assignDriver("frank");
        enemyTank.driveForward();
        enemyTank.fireWeapon();

        // here RobotAdapter uses us to deal with EnemeyAttacker interface and call respective methods on robot
        // inspite of robot not adhering to the Enemey Attacker interface. thus adapter pattern is useful
        // to convert things to the way we need the even if they are not
        EnemyRobot robot = new EnemyRobot();
        EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(robot);
        robotAdapter.assignDriver("marshall");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }

}
