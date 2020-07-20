package com.vince.demo.singleton.unsafe;

public class LazySingleton {

    private LazySingleton(){

    }

    private static LazySingleton lazySingleton;

    public static LazySingleton getInstance() {

        if (lazySingleton == null) {

            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


}
