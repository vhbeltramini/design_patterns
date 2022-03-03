package com.vhbeltramini.store.budget;

import com.vhbeltramini.store.budget.Budget;
import com.vhbeltramini.store.budget.BudgetItem;

import java.math.BigDecimal;

public class MainComposition {

    public static void main(String[] args) {
        Budget oldBudget = new Budget();
        oldBudget.addItem(new BudgetItem(new BigDecimal("100")));

        Budget newBudget = new Budget();
        newBudget.addItem(new BudgetItem(new BigDecimal("200")));
        newBudget.addItem(oldBudget);

        System.out.println(newBudget.getValue());
    }

}
