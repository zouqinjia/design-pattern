package com.vince.demo.facade;

/**
 * 门面模式;
 * 要求一个子系统与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次的接口，使得子系统更加易于使用。
 * 门面对象是外界访问子系统内部的唯一通道.也就是说该对象没有实际的业务逻辑，只是一个委托类。
 * 1、减少系统的相互依赖
 * 客户端所有的依赖都是对门面对象的依赖，与子系统无关。如果客户端直接访问子系统，这样是的设计是强关联设计,不合理、
 * 2、提高灵活性
 * 依赖减少了，灵活性自然提高了。不管子系统内部变化如何，只要不影响门面，都不需要修改客户端代码来适应子系统变更
 */
public class Test {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl(new TV(),new AirConditioner(),new Light());

        remoteControl.on();
        remoteControl.off();
    }
}
