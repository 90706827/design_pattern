package com.jangni.strategy;

/**
 * @Description:
 * @Autor: Jangni
 * @Date: Created in  2018/3/21/021 0:37
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyBehavior.FlyNoWay");
    }
}