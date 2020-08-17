package com.vince.demo.observer;

/**
 * 观察者模式
 * 定义对象间一种一个多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新.
 * 1、符合开闭原则，同时也实现类间解耦，继续实现Observer接口即可。业务变化client代码还是需要修改的。
 * 2、观察者与被观察者之间是抽象耦合，不管是扩展观察者还是被观察者都是非常简单。
 * 3、建立一套触发机制，根据类的单一职责原则，使用观察者模式可以触发一个完整的触发链。是链。
 * 4、同步通知处理影响效率就换成异步通知。
 */
public class Test {

    public static void main(String[] args) {

        // 定义观察者
        Observer observer = new ConcreteObserver();
        // 创建被观察目标对象
        WeatherData subject = new WeatherData();
        // 注册观察者对象
        subject.registerObserver(observer);
        // 目标状态改变并通知观察者
        subject.updateData(1,2,3);
    }
}
