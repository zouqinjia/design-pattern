package com.vince.demo.observer;

/**
 * concrete observer
 * 具体观察者，实现观察者接收到通知的具体业务逻辑
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(int temperature, int pressure, int humidity) {

        System.out.println("接收数据变化通知：温度：" + temperature + ",气压" + pressure + ",湿度: " + humidity);
    }
}
