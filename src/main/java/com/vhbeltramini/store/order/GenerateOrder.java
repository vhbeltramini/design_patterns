package com.vhbeltramini.store.order;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateOrder {

    private String client;
    public BigDecimal budgetValue;
    private int itensQuantity;

    public GenerateOrder(String client, BigDecimal budgetValue, int itensQuantity) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.itensQuantity = itensQuantity;
    }

    public String getClient() {
        return client;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public int getItensQuantity() {
        return itensQuantity;
    }
}
