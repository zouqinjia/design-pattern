package com.vince.demo.template;

/**
 * Concrete Class
 * 实现子类具体业务逻辑
 */
public class Tea extends Drink {

    @Override
    protected void addMeterInCup() {

        System.out.println("将茶叶放入杯中..");
    }

    @Override
    protected void addOther() {

        System.out.println("加入糖块....");
    }
}
