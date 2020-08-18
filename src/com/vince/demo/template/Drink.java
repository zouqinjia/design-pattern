package com.vince.demo.template;

/**
 * Abstract Class
 *
 * ① 模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法。
 *
 * ② 基本方法：是整个算法中的一个步骤，包含以下几种类型。
 * 抽象方法：在抽象类中申明，由具体子类实现。
 * 具体方法：在抽象类中已经实现，在具体子类中可以继承或重写它。
 * 钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。
 */
public abstract class Drink {


    /**
     * 定义流程顺序，不允许子类修改流程，子类只能自定抽象方法.
     */
    final void make(){

        this.fireWater();
        this.addMeterInCup();
        this.putWaterInCup();
        this.addOther();
    }

    public void fireWater(){

        System.out.println("煮沸开水");
    }

    public void putWaterInCup(){

        System.out.println("将水放进杯中");
    }

    /**
     * 抽象方法，子类实现自己的业务逻辑
     */
    protected abstract void addMeterInCup();

    protected abstract void addOther();

}
