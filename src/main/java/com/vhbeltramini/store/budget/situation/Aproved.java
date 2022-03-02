package com.vhbeltramini.store.budget.situation;

import com.vhbeltramini.store.DomainException;
import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public class Aproved extends BudgetSituation {

    @Override
    public BigDecimal calculateExtraDiscountValue(Budget budget) {
         return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalise(Budget budget) {
        budget.setSituation(new Finished());
    }
}
