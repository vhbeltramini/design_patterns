package com.vhbeltramini.store.discount;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForBudgetWithValueGreaterThanFiveHundred extends Discount {

    public DiscountForBudgetWithValueGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean mustApplyDiscount(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
