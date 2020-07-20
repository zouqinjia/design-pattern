package com.vince.demo.singleton.safe;

/**
 * JLS官方推荐单例实现方式，使用静态内部类
 * 原因：一个类只有在被使用时才会初始化，而类初始化过程是非并行的，这些都由JLS保证
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {

    }


    public static class InnerClass {

        // volatile 关键字保证变量在各线程的可见性
        private  static final StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }


    public static StaticInnerClassSingleton getInstance() {

        return InnerClass.staticInnerClassSingleton;
    }
}
