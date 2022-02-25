package com.vhbeltramini.store.taxes;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public interface Tax {

    BigDecimal calculate(Budget budget);
}
