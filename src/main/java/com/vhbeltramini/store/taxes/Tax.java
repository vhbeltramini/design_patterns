package com.vhbeltramini.store.taxes;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Tax {

    private Tax otherTax;

    public Tax(Tax otherTax) {
        this.otherTax = otherTax;
    }

    protected abstract BigDecimal performCalculation(Budget budget);

    public BigDecimal calculate(Budget budget) {
        BigDecimal taxValue = performCalculation(budget);
        if (otherTax == null) {
            return taxValue;
        }
        return taxValue.add(otherTax.performCalculation(budget));
    };

}
