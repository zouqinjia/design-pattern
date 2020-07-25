package com.vince.demo.prototype.deepclone;

import java.io.Serializable;

public class Order implements Serializable {

    private Integer orderId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                '}';
    }
}
