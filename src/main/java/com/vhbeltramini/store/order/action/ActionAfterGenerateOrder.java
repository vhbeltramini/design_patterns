package com.vhbeltramini.store.order.action;

import com.vhbeltramini.store.order.Order;

public interface ActionAfterGenerateOrder {

    public abstract void execute(Order order);

}
