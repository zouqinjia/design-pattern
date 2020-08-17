package com.vince.demo.observer;

/**
 * 抽象观察者对象，
 * 定义观察者接收到通知后的行为
 */
public interface Observer {

   void update(int temperature,int pressure,int humidity);
}
