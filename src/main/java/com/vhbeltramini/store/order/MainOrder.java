package com.vhbeltramini.store.order;

import com.vhbeltramini.store.budget.Budget;
import com.vhbeltramini.store.order.action.LogOrders;
import com.vhbeltramini.store.order.action.SaveOrderInDatabase;
import com.vhbeltramini.store.order.action.SendOrderEmail;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * This class was created for simulate a simple use case of the Command, Observer and Facade pattern
 */
public class MainOrder {

    public static void main(String[] args) {
        BigDecimal budgetValue = new BigDecimal("600");
        String client = "Victor Hugo";
        int itensQuantity = 6;

        GenerateOrder generatedOrder = new GenerateOrder(client, budgetValue, itensQuantity);

        new HandlerGenerateOrder(
                Arrays.asList(new SaveOrderInDatabase(), new SendOrderEmail(), new LogOrders())
        ).execute(generatedOrder);
    }

}
