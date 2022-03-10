package com.example.testapp;

public class Main {

    public static void main(String[] args)
    {
        //System.out.println("Frei fur immer und ewig");
        MarladDuck firstDuck = new MarladDuck(new QuackStrategy(), new SwimStrategy(), new FlyStrategy());
        ReadheadDuck secondtDuck = new ReadheadDuck(new DoNotQuackStrategy(), new SwimStrategy(), new DoNotFlyStrategy());

        firstDuck.display();
        firstDuck.fly();
        firstDuck.swim();

        secondtDuck.display();
        secondtDuck.fly();
        secondtDuck.quack();
    }
}
