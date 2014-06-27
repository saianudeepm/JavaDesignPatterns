package com.design.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 2:27 AM
 */

/** The concrete builder class that assembles the parts
  * of the finished Robot object
**/

public class OldRobotBuilder implements IRobotBuilder {

    Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Old Robot Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Old Robot Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Old Robot Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Old Robot Legs");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
