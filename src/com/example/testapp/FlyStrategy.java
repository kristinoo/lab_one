package com.example.testapp;

public class FlyStrategy extends Strategy{
    @Override
    public void action(){
        System.out.println("* is flying now *");
    }
}
