package com.example.StrategyPattern;

public class Quack implements QuackBehavior{
    public void quack() {
        System.out.println("꽥");
    }
}
