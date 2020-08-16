package com.vince.demo.mediator.mediator;

import com.vince.demo.mediator.colleague.Purchase;
import com.vince.demo.mediator.colleague.Sale;
import com.vince.demo.mediator.colleague.Stock;

public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public abstract void execute(String eventType, Object... objects);
}
