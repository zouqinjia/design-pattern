package com.vince.demo.mediator.mediator;

/**
 * 中介者Mediator定义了多个private方法，其目的是处理各个对象之间的依赖关系，就是说把原有一个要依赖多个对象的情况转移到中介者的private方法中实现.
 *
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String eventType, Object... objects) {

        Integer number = (Integer) objects[0];
        if(eventType.equals("purchase.buy")){

            this.buyComputer(number);
        }else if(eventType.equals("sale.sell")){

            this.sellComputer(number);
        }else if(eventType.equals("sale.offsell")){

            this.offSell();
        }else if(eventType.equals("stock.clear")){

            this.clearStock();
        }
    }

    /**
     * 采购电脑
     */
    public void buyComputer(int number) {

        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {// 销售情况良好

            System.out.println("采购IBM电脑: " + number + "台");
            super.stock.increase(number);
        } else { // 销售情况一般

            number = number / 2;
            System.out.println("销售情况一般。折半购买： " + number + "台");
            super.stock.increase(number);
        }
    }

    /**
     * 销售电脑
     */
    private void sellComputer(int number) {

        if (super.stock.getComputerNumber() < number) {// 库存不够

            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    /**
     * 打折销售电脑
     */
    public void offSell(){

        System.out.println("折价销售IBM电脑: " +stock.getComputerNumber()+"台");
    }

    /**
     * 清仓处理
     */
    public void clearStock(){

        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
