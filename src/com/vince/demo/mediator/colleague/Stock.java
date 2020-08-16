package com.vince.demo.mediator.colleague;

import com.vince.demo.mediator.mediator.AbstractMediator;
/**
 * colleague
 */
public class Stock extends AbstractColleague {

    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator abstractMediator) {

        super(abstractMediator);
    }

    public void increase(int number){

        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数据为： " + COMPUTER_NUMBER);
    }

    public void decrease(int number){

        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存下降为： " +COMPUTER_NUMBER);
    }

    public int getComputerNumber(){

        return COMPUTER_NUMBER;
    }

    public void clearStock(){

        System.out.println("清理存货，数量为: " + COMPUTER_NUMBER);
        super.abstractMediator.execute("stock.clear");
    }



}
