package com.example.testapp;

import javax.swing.plaf.nimbus.State;

public class MarladDuck extends Duck {

    public MarladDuck(Strategy quackStrategy, Strategy swimStrategy, Strategy flyStrategy ){
        super (quackStrategy, swimStrategy, flyStrategy); // в родительском классе есть конструктор и мы его переиспользуем
    }

    @Override
    public void display(){
        super.display(); //
        System.out.println("I am a MarladDuck");
    }

}
