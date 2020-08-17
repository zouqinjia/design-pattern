package com.vince.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * concrete subject 具体被观察者目标类
 *
 * 定义具体哪些事件需要通知观察者
 */
public class WeatherData implements Subject {

    int temperature, pressure, humidity;
    List<Observer> observers;

    public WeatherData() {

        observers = new ArrayList<>();
    }

    public void updateData(int temperature, int pressure, int humidity) {

        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        this.notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

        int i = observers.indexOf(observer);
        if (i > 0) {

            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {

        // 遍历通知观察者
        observers.forEach(observer -> {

            observer.update(this.temperature, this.pressure, this.humidity);
        });
    }
}
