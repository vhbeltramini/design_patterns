package com.vhbeltramini.store.order;

import com.vhbeltramini.store.budget.Budget;
import com.vhbeltramini.store.budget.BudgetItem;
import com.vhbeltramini.store.order.action.ActionAfterGenerateOrder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class HandlerGenerateOrder {

    private List<ActionAfterGenerateOrder> actions;

    public HandlerGenerateOrder(List<ActionAfterGenerateOrder> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder generateOrder) {
        BudgetItem budgetItem = new BudgetItem(new BigDecimal("100"));
        Budget budget = new Budget();
        budget.addItem(budgetItem);
        budget.addItem(budgetItem);

        Order order = new Order(generateOrder.getClient(), LocalDateTime.now(), budget);

        actions.forEach(action -> action.execute(order));
    }

}
