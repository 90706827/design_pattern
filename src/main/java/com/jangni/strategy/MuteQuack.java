package com.jangni.strategy;

/**
 * @Description:
 * @Autor: Jangni
 * @Date: Created in  2018/3/21/021 0:39
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("QuackBehavior.MuteQuack");
    }
}