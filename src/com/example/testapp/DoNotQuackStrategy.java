package com.example.testapp;

public class DoNotQuackStrategy extends Strategy{

    @Override
    public void action() {
        System.out.println("I don't quack");
    }
}
