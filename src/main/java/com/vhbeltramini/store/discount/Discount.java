package com.vhbeltramini.store.discount;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    protected abstract BigDecimal performCalculation(Budget budget);
    public abstract boolean mustApplyDiscount(Budget budget);

    public BigDecimal calculate(Budget budget) {
        if (mustApplyDiscount(budget)) {
            return performCalculation(budget);
        }
        return next.calculate(budget);
    }

}
