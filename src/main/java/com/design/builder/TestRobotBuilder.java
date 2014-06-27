package com.design.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 2:38 AM
 */
public class TestRobotBuilder {


    public static void main(String args[]){

        IRobotBuilder robotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);
        robotEngineer.makeRobot();
        robotEngineer.getRobot();


    }

}
