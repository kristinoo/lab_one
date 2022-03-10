package com.example.testapp;

public class DoNotFlyStrategy extends Strategy {

    @Override
    public void action() {
        System.out.println("I don't fly");
    }
}
