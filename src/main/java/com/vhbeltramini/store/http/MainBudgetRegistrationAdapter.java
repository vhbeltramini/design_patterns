package com.vhbeltramini.store.http;

import com.vhbeltramini.store.budget.Budget;
import com.vhbeltramini.store.budget.BudgetItem;
import com.vhbeltramini.store.budget.BudgetRegistration;

import java.math.BigDecimal;

public class MainBudgetRegistrationAdapter {

    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("100")));
        budget.addItem(new BudgetItem(new BigDecimal("100")));
        budget.approved();
        budget.finalized();

        BudgetRegistration budgetRegistration = new BudgetRegistration(new JavaHttpClient());
        budgetRegistration.register(budget);
    }

}
