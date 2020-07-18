package com.vince.demo.simplefactory;

/**
 *  抽象产品类，作为父类出现，供各种pizza种类继承实现
 */
public abstract class Pizza {

    abstract void prepare();

    abstract void make();

    abstract void complete();

}
