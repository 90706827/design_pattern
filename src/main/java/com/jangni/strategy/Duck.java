package com.jangni.strategy;

/**
 * @Description:
 * @Autor: Jangni
 * @Date: Created in  2018/3/21/021 0:36
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
