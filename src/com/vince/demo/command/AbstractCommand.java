package com.vince.demo.command;

public abstract class AbstractCommand {

    int value;
    /**
     * 所有子类共享一个全部变量，如果不是使用static修饰则是每个子类拥有不同的实例
     */
    static Receiver receiver = new Receiver();

    public abstract int execute(int value);
    public abstract int reset();
}
