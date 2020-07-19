package com.vince.demo.simplefactory;

/**
 *  抽象产品类，作为父类出现，供各种pizza种类继承实现
 */
public abstract class Pizza {

    public abstract void prepare();

    public abstract void make();

    public abstract void complete();

}
