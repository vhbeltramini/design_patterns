package com.vhbeltramini.store.order;

import com.vhbeltramini.store.budget.Budget;

import java.time.LocalDateTime;

public class HandlerGenerateOrder {

    /**
     * Here we would have a constructor with all injected dependencies used by our handler to save and process the data
     */

    public void execute(GenerateOrder generateOrder) {
        Budget budget = new Budget(generateOrder.getBudgetValue(), generateOrder.getItensQuantity());
        Order order = new Order(generateOrder.getClient(), LocalDateTime.now(), budget);

        /**
         * Here we would use those inject dependencies to implement all the required data process
         */
    }

}
