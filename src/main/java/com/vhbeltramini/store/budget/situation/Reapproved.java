package com.vhbeltramini.store.budget.situation;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public class Reapproved extends BudgetSituation{

    @Override
    public void finalise(Budget budget) {
        budget.setSituation(new Finished());
    }
}
