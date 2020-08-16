package com.vince.demo.mediator.colleague;

import com.vince.demo.mediator.mediator.AbstractMediator;

/**
 * colleague
 */
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator abstractMediator) {

        super(abstractMediator);
    }

    public void buyIBMComputer(int number){

        super.abstractMediator.execute("purchase.buy",number);
    }

    public void refuseBuyIBM(){

        System.out.println("不要再采购IBM电脑");
    }
}
