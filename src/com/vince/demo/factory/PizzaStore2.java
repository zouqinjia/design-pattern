package com.vince.demo.factory;

import com.vince.demo.simplefactory.Pizza;
import com.vince.demo.simplefactory.PizzaMete;
import com.vince.demo.simplefactory.PizzaSausage;
import com.vince.demo.simplefactory.PizzaVegetable;

public class PizzaStore2 implements PizzaFactory {

    /**
     * pizza
     */
    void orderPizza(String typePizza) {

        System.out.println("第二家店 客户开始预定披萨..类型是：" + typePizza);

        Pizza pizza = this.createPizza(typePizza);
        pizza.prepare();
        pizza.make();
        pizza.complete();
    }

    /**
     * 新的制作等级
     */
    void orderPizzaCold(String typePizza) {
        System.out.println("第二家店 客户开始预定未加工的披萨..类型是：" + typePizza);

        Pizza pizza = this.createPizza(typePizza);
        pizza.prepare();
        pizza.make();
//        pizza.complete();
    }

    /**
     * 现在看来，这个店面，不管有多少pizza种类。都是自己进行控制的.
     * 如果该店面新加了产品种类，只需要修改自己的pizza店的代码就可以了.
     * 而不会影响其他店的正常运行.
     *
     * @param pizzaType
     * @return
     */
    @Override
    public Pizza createPizza(String pizzaType) {

        if ("vegetable".equals(pizzaType)) {

            return new PizzaVegetable();
        } else if ("mete".equals(pizzaType)) {

            return new PizzaMete();
        } else if ("sausage".equals(pizzaType)) {

            return new PizzaSausage();
        }
        return null;
    }

    @Override
    public Pizza createRawPizza(String pizzaType) {

        return null;
    }

    @Override
    public Milk createMilk(String milkType) {

        return null;
    }
}
