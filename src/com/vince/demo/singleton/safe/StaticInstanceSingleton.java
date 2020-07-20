package com.vince.demo.singleton.safe;

public class StaticInstanceSingleton {

    private StaticInstanceSingleton (){

    }
    private static final StaticInstanceSingleton STATIC_INSTANCE_SINGLETON = new StaticInstanceSingleton();

    public static StaticInstanceSingleton getInstance(){

        return STATIC_INSTANCE_SINGLETON;
    }
}
