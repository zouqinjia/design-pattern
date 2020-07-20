package com.vince.demo.singleton.safe;

import com.vince.demo.singleton.unsafe.LazySingleton;

public class SynchronizedSingleton {

    private SynchronizedSingleton(){

    }

    private static  SynchronizedSingleton synchronizedSingleton;

    public static synchronized SynchronizedSingleton getInstance() {

        if (synchronizedSingleton == null) {

            synchronizedSingleton = new SynchronizedSingleton();
        }
        return synchronizedSingleton;
    }
}
