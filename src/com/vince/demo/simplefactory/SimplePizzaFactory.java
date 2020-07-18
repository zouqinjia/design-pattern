package com.vince.demo.simplefactory;

/**
 * 简单披萨工厂
 * 问题：
 * 如果新增一加新的披萨店需要新增新的披萨种类，
 * 此时我们必须修改工厂类，但是一旦修改工厂类就可以会对其它稳定的披萨店产生影响，不符合开闭原则.
 * 总结：
 * 1、简单工厂模式的要点就在于当你需要什么产品，只需要传入参数，就可以获取对应得产品，而无需关注产品创建细节.
 * 2、简单工厂模式最大得有点在于实现分离对象的创建和对象的使用。但是产品过多且多变会导致工厂代码非常复杂
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String pizzaType) {

        if ("mete".equals(pizzaType)) {

            return new PizzaMete();
        } else if ("sausage".equals(pizzaType)) {

            return new PizzaSausage();
        } else if ("vegetable".equals(pizzaType)) {

            return new PizzaVegetable();
        } else {

            throw new RuntimeException("unsupported current pizza type. " + pizzaType);
        }

    }

}
