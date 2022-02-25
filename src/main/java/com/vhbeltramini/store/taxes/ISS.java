package com.vhbeltramini.store.taxes;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public class ISS implements Tax {

    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }

}
