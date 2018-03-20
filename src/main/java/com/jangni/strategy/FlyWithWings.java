package com.jangni.strategy;

/**
 * @Description:
 * @Autor: Jangni
 * @Date: Created in  2018/3/21/021 0:38
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("FlyBehavior.FlyWithWings");
    }
}