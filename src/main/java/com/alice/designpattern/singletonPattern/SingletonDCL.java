package com.alice.designpattern.singletonPattern;

//双检锁/双重校验锁（DCL，即 double-checked locking）
public class SingletonDCL {
    private static SingletonDCL instance;

    private SingletonDCL() {
    }

    public static SingletonDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }

    public void showMessage(String str){
        System.out.println(str);
    }
}
