package com.vhbeltramini.store.order.action;

import com.vhbeltramini.store.order.Order;

public class LogOrders implements ActionAfterGenerateOrder {
    @Override
    public void execute(Order order) {
        System.out.println("log pedido" + order);
    }
}
