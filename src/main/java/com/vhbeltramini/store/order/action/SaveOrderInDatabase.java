package com.vhbeltramini.store.order.action;

import com.vhbeltramini.store.order.Order;

public class SaveOrderInDatabase implements ActionAfterGenerateOrder {

    @Override
    public void execute(Order order) {
        System.out.println("Saving order in the database.");
    }

}
