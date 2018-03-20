package com.jangni.strategy;

/**
 * @Description:
 * @Autor: Jangni
 * @Date: Created in  2018/3/21/021 0:39
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performFly();
    }
}
