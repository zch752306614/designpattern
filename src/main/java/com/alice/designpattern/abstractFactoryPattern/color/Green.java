package com.alice.designpattern.abstractFactoryPattern.color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("class.Green,method.fill()");
    }
}
