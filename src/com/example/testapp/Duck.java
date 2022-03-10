package com.example.testapp;

public class Duck {
    private Strategy quackStrategy;
    private Strategy swimStrategy;
    private Strategy flyStrategy;

    public Duck(Strategy quackStrategy, Strategy swimStrategy, Strategy flyStrategy){
        this.quackStrategy = quackStrategy;
        this.swimStrategy = swimStrategy;
        this.flyStrategy = flyStrategy;
    }

    public void display() {System.out.println("I am a duck");} //метод представления

    public void quack() {quackStrategy.action(); }
    public void swim() {swimStrategy.action(); }
    public void fly() {flyStrategy.action(); }

}
