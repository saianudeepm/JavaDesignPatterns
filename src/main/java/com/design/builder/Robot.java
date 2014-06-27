package com.design.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 2:23 AM
 */
public class Robot implements IRobot {

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;


    @Override
    public void setRobotHead(String head) {
        this.robotHead=head;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.robotTorso=torso;
    }

    @Override
    public void setRobotArms(String arms) {
        this.robotArms=arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.robotLegs=legs;
    }
}
