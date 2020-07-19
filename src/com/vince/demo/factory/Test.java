package com.vince.demo.factory;

public class Test {


    public static void main(String[] args) {

        /**
         * 工厂提供创建不同的产品方法，产品细节由子类具体实现
         * 简单工厂一旦增加新的pizza需要修改工厂类从而会影响全部使用工厂的店
         * 工厂模式只是提供一个创建产品的接口出来，具体的产品细节由具体工厂子类进行实现，所以如果有不同需要的披萨店可以新增一个子类工厂自定义pizza的制作步骤，不会对其他店造成影响。
          */


        PizzaStore1 pizzaStore1 = new PizzaStore1();

        pizzaStore1.orderPizza("mete");

        PizzaStore2 pizzaStore2 = new PizzaStore2();
        pizzaStore2.orderPizzaCold("mete");


    }

}
