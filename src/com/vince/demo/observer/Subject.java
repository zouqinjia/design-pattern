package com.vince.demo.observer;

/**
 * 被观察者 目标类
 *定义被观察者必须实现的职责：管理与通知观察者
 */
public interface Subject {

    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 当观察者状态发生改变，通知被观察者
     */
    void notifyObserver();
}
