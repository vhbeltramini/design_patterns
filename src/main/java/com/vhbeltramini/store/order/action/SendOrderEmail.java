package com.vhbeltramini.store.order.action;

import com.vhbeltramini.store.order.Order;

public class SendOrderEmail implements ActionAfterGenerateOrder {

    @Override
    public void execute(Order order) {
        System.out.println("Sending email with the data of the order.");
    }

}
