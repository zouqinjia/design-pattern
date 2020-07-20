package com.vince.demo.singleton.safe;

public class DCLSingleton {

    private DCLSingleton() {

    }

    /**
     * volatile 关键字保证变量在各线程的可见性
     * 在java5以前，volatile原语不怎么强大，只能保证对象的可见性
     * 但在java5之后，volatile语义加强了，被volatile修饰的对象，将禁止该对象上的读写指令重排序
     * 这样，就保证了线程B读对象时，已经初始化完全了
     */
    private volatile static DCLSingleton dclSingleton;

    /**
     *  根据JLS规范，单纯的double check 代码不可靠！线程有可能得到一个不为null，但是构造不完全的对象。
     *  原因：造成不可靠的原因是编译器为了提高执行效率的指令重排。只要认为在单线程下是没问题的，它就可以进行乱序写入！以保证不要让cpu指令流水线中断。
     *  创建对象的过程是非原子性的，所以加上指令重排创建对象的步骤可能会被打乱，所以线程B进来访问对象判断是否为null时，该对象可能没有执行完构造函数.
     *  所以必须要加上volatile保证变量的可见性外同时禁止该对象上的读写指令重排
     */
    public static  DCLSingleton getInstance() {

        // 同步代码块优化同步方法资源等待
        if (dclSingleton == null) {

            synchronized (dclSingleton) {

                // 需要进行double check，在同步代码块释放锁之后别的线程有了第一次check中在等待创建新的对象.

                if (dclSingleton == null) {

                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}
