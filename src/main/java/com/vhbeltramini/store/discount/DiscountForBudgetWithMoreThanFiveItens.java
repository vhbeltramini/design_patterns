package com.vhbeltramini.store.discount;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForBudgetWithMoreThanFiveItens extends Discount {

    public DiscountForBudgetWithMoreThanFiveItens(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean mustApplyDiscount(Budget budget) {
        return budget.getItensQuantity() > 5;
    }
}
