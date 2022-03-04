package com.vhbeltramini.store.budget;

import com.vhbeltramini.store.budget.situation.BudgetSituation;
import com.vhbeltramini.store.budget.situation.Finished;
import com.vhbeltramini.store.budget.situation.InAnalysis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Budgetable {

    private BigDecimal value;
    private BudgetSituation situation;
    private List<Budgetable> itens;

    public Budget() {
        this.value = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situation = new InAnalysis();
    }

    @Override
    public BigDecimal getValue() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public List<Budgetable> getItens() {
        return itens;
    }

    public void addItem(Budgetable item) {
        this.value = value.add(item.getValue());
        this.itens.add(item);
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
