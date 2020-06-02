package com.alice.designpattern.singletonPattern;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonDCL singletonDCL = SingletonDCL.getInstance();
        SingletonHungry singletonHungry = SingletonHungry.getInstance();
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonRegister  singletonRegister = SingletonRegister.getInstance();
        SingletonSynchronized singletonSynchronized = SingletonSynchronized.getInstance();
        singletonDCL.showMessage("SingletonDCL");
        singletonHungry.showMessage("SingletonHungry");
        singletonLazy.showMessage("SingletonLazy");
        singletonRegister.showMessage("SingletonRegister");
        singletonSynchronized.showMessage("SingletonSynchronized");
    }
}
