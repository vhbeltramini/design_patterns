package com.vhbeltramini.store.order;

import com.vhbeltramini.store.budget.Budget;
import com.vhbeltramini.store.order.action.ActionAfterGenerateOrder;

import java.time.LocalDateTime;
import java.util.List;

public class HandlerGenerateOrder {

    private List<ActionAfterGenerateOrder> actions;

    public HandlerGenerateOrder(List<ActionAfterGenerateOrder> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder generateOrder) {
        Budget budget = new Budget(generateOrder.getBudgetValue(), generateOrder.getItensQuantity());
        Order order = new Order(generateOrder.getClient(), LocalDateTime.now(), budget);

        actions.forEach(action -> action.execute(order));
    }

}
