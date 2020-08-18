package com.vince.demo.template;

/**
 * Concrete Class
 * 实现子类具体业务逻辑
 */
public class Coffee extends Drink {

    @Override
    protected void addMeterInCup() {

        System.out.println("将咖啡粉放入杯中.");
    }

    @Override
    protected void addOther() {

        System.out.println("加入糖块并且加入牛奶.");
    }
}
