package com.vhbeltramini.store.taxes;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public class ICMS extends Tax {

    public ICMS(Tax otherTax) {
        super(otherTax);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

}
