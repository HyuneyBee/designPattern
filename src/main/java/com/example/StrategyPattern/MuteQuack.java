package com.example.StrategyPattern;

public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("조용~");
    }
}
