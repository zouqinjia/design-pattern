package com.vince.demo.factory;

import com.vince.demo.simplefactory.Pizza;
import com.vince.demo.simplefactory.PizzaMete;
import com.vince.demo.simplefactory.PizzaSausage;
import com.vince.demo.simplefactory.PizzaVegetable;

public class PizzaStore1 implements PizzaFactory {

    /**
     * 预定普通pizza
     */
    void orderPizza(String typePizza) {

        System.out.println("第一家店客户开始预定披萨..类型是：" + typePizza);

        Pizza pizza = this.createPizza(typePizza);
        pizza.prepare();
        pizza.make();
        pizza.complete();

    }



    /**
     * 预定未加工的pizza
     */
    void orderMilk(String typeMilk) {
        System.out.println("第一家店客户开始预定牛奶..类型是：" + typeMilk);

        Pizza pizza = this.createPizza(typeMilk);
        pizza.prepare();
        pizza.make();
        pizza.complete();
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

    /**
     * 未加工披萨
     * @param pizzaType
     * @return
     */
    @Override
    public Pizza createRawPizza(String pizzaType) {

        return null;
    }

    /**
     * 选择不同的牛奶
     * @param milkType
     * @return
     */
    @Override
    public Milk createMilk(String milkType) {

        return null;
    }
}
