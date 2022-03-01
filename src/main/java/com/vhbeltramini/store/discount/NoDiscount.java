package com.vhbeltramini.store.discount;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean mustApplyDiscount(Budget budget) {
        return true;
    }
}
