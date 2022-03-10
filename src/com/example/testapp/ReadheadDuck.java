package com.example.testapp;

public class ReadheadDuck extends Duck{

    public ReadheadDuck(Strategy quackStrategy, Strategy swimStrategy, Strategy flyStrategy ){
        super (quackStrategy, swimStrategy, flyStrategy); // в родительском классе есть конструктор и мы его переиспользуем
    }

    @Override
    public void display(){
        super.display(); // вызываем функцию у родительского класса
        System.out.println("I am a ReadheadDuck");
    }
}
