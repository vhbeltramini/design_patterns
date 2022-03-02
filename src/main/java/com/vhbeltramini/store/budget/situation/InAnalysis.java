package com.vhbeltramini.store.budget.situation;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public class InAnalysis extends BudgetSituation {

    @Override
    public BigDecimal calculateExtraDiscountValue(Budget budget) {
         return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budget budget) {
        budget.setSituation(new Aproved());
    }

    @Override
    public void reapproved(Budget budget) {
        budget.setSituation(new Reapproved());
    }

}
