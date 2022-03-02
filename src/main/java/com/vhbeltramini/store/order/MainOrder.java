package com.vhbeltramini.store.order;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class was created for simulate a simple use case of the Command pattern
 */
public class MainOrder {

    public static void main(String[] args) {
        BigDecimal budgetValue = new BigDecimal("600");
        String client = "Victor Hugo";
        int itensQuantity = 6;

        GenerateOrder generateOrder = new GenerateOrder(client, budgetValue, itensQuantity);

        HandlerGenerateOrder handler = new HandlerGenerateOrder(/*dependencies*/);
        handler.execute(generateOrder);
    }

}
