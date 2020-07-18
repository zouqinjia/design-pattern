package com.vince.demo.simplefactory;

public class Test {

    public static void main(String[] args) {

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("mete");
        pizzaStore.orderPizza("sausage");
        pizzaStore.orderPizza("vegetable");

    }
}
