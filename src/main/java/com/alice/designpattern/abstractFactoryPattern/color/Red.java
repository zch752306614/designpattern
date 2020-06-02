package com.alice.designpattern.abstractFactoryPattern.color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("class.Red,method.fill()");
    }
}
