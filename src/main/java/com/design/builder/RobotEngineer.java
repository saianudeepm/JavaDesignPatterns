package com.design.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 2:33 AM
 */

/** The director / engineer class creates a Robot using the
 * builder interface that is defined (OldRobotBuilder)
 **/
 public class RobotEngineer {
    private IRobotBuilder robotBuilder;

    // OldRobotBuilder specification is sent to the engineer
    public RobotEngineer(IRobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public void makeRobot(){
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotLegs();
    }

    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }
}
