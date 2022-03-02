package com.vhbeltramini.store.budget.situation;

import com.vhbeltramini.store.DomainException;
import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

// The implementation on this package is a simple example of  implementation using State Pattern
public abstract class BudgetSituation {

    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return BigDecimal.ZERO;
    };

    public void reapproved(Budget budget) {
        throw new DomainException("The budget cannot be reproved");
    };

    public void approve(Budget budget) {
        throw new DomainException("The budget cannot be approved");
    };

    public void finalise(Budget budget) {
        throw new DomainException("The budget cannot be finalised");
    };

}
