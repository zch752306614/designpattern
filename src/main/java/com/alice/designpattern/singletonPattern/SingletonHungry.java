package com.alice.designpattern.singletonPattern;

//饿汉式
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }

    public void showMessage(String str){
        System.out.println(str);
    }
}
