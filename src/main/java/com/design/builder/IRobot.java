package com.design.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 2:22 AM
 */
// This is the interface that will be returned from the builder
public interface IRobot {
    public void setRobotHead(String head);
    public void setRobotTorso(String torso);
    public void setRobotArms(String arms);
    public void setRobotLegs(String legs);
}

