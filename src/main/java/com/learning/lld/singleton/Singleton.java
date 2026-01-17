package com.learning.lld.singleton;

public class Singleton {

    private Singleton(){
        System.out.println("Instance created..");
    }
    private static class InnerSingleton{
        static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return InnerSingleton.INSTANCE;
    }
}
