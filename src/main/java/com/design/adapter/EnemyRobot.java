package com.design.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 6/22/14
 * Time: 1:47 PM
 */

/**
 *This is Enemy Robot which doesnt adhere to the EnemyAttacker interface
 * So later we need to create a Adapter class so that it adheres to the Enemey Attacker interface
 */
public class EnemyRobot {

    private int id;

    public EnemyRobot(){
        this.id= System.identityHashCode(this);
    }
    public void smashWithHands(){
        System.out.println(id+": robot smashing with the hands");
    }
    public void walkForward(){
        System.out.println(id+": Robot walking forward");
    }

    public void reactToHuman(String humanName){
        System.out.println(id+": Robot configured to be controlled by :"+humanName);
    }
}
