package com.vhbeltramini.store.budget;

import com.vhbeltramini.store.budget.situation.BudgetSituation;
import com.vhbeltramini.store.budget.situation.Finished;
import com.vhbeltramini.store.budget.situation.InAnalysis;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private Integer itensQuantity;
    private BudgetSituation situation;

    public Budget(BigDecimal value) {
        this.value = value;
    }

    public Budget(BigDecimal value, Integer itensQuantity) {
        this.value = value;
        this.itensQuantity = itensQuantity;
        this.situation = new InAnalysis();
    }

    public BigDecimal getValue() {
        return value;
    }

    public Integer getItensQuantity() {
        return itensQuantity;
    }

    public BudgetSituation getSituation() {
        return situation;
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }


    public void applyExtraDiscount() {
        this.value = this.value.subtract(this.situation.calculateExtraDiscountValue(this));
    }

    public void approved() {
        this.situation.approve(this);
    }

    public void reapproved() {
        this.situation.reapproved(this);
    }

    public void finalized() {
        this.situation.finalise(this);
    }

    public boolean isFinalized() {
        return this.situation instanceof Finished;
    }


}
