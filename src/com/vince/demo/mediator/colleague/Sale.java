package com.vince.demo.mediator.colleague;

import com.vince.demo.mediator.mediator.AbstractMediator;

import java.util.Random;
/**
 * colleague
 */
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator abstractMediator) {

        super(abstractMediator);
    }

    public void saleIBMComputer(int number){

        System.out.println("销售IBM电脑: " + number);
        super.abstractMediator.execute("sale.sell",number);
    }

    public int getSaleStatus(){

        Random random = new Random(System.currentTimeMillis());
        int i = random.nextInt(100);
        System.out.println("IBM销售情况为："+i);
        return i;
    }

    public void offSale(){

        super.abstractMediator.execute("sale.offsell");
    }
}
