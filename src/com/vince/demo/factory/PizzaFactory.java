package com.vince.demo.factory;

import com.vince.demo.simplefactory.Pizza;

/**
 * 抽象工厂类，也是我们工厂设计模式的一个核心思想类（面向接口编程）
 * 定义：
 * 定义一个用于创建妒忌想的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类.
 */
public interface PizzaFactory {

    /**
     * 为了与我们抽象工厂模式进行对比而添加代码
     * 如果我们这个工厂生产的产品增加了，也就是说我们的产品族不惮以，我们可以直接再我们的Factory类中
     * 加入我们新的抽象方法供我们的具体工厂实现.
     */
    Pizza createPizza(String pizzaType);

    /**
     * 用于制作新的等级结构产品
     */
    Pizza createRawPizza(String pizzaType);

    /**
     * 用于制作新的等级结构产品
     */
    Milk createMilk(String milkType);
}
