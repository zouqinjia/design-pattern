package com.vince.demo.mediator;

import com.vince.demo.mediator.colleague.Purchase;
import com.vince.demo.mediator.colleague.Sale;
import com.vince.demo.mediator.colleague.Stock;
import com.vince.demo.mediator.mediator.AbstractMediator;
import com.vince.demo.mediator.mediator.Mediator;

/**
 * 中介者模式：
 *  用一个中介对象封装一系列的对象交互，中介者使各个对象不需要显示的相互作用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 *  colleagues只负责处理自己地活动行为，与自己无关地活动就丢给mediator去处理。（自发行为，依赖行为）
 *  在多个对象依赖地情况下，通过加入中介者角色，取消了对各对象的关联关系或依赖关系，少了对象的耦合性。
 */
public class Test {

    public static void main(String[] args) {

        // mediator
        AbstractMediator abstractMediator = new Mediator();
        // colleague
        Purchase purchase = new Purchase(abstractMediator);
        Sale sale = new Sale(abstractMediator);
        Stock stock = new Stock(abstractMediator);

        abstractMediator.setPurchase(purchase);
        abstractMediator.setSale(sale);
        abstractMediator.setStock(stock);

        purchase.buyIBMComputer(100);

        sale.saleIBMComputer(1);

        stock.clearStock();
    }
}
