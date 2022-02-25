package com.vhbeltramini.store.taxes;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public class TaxesCalculator {

    public BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }

}
