package com.alice.designpattern.singletonPattern;

//懒汉式，线程安全
public class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized() {
    }

    public static synchronized SingletonSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }

    public void showMessage(String str){
        System.out.println(str);
    }
}
