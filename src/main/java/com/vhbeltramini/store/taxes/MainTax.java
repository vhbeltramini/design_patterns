package com.vhbeltramini.store.taxes;

import com.vhbeltramini.store.budget.Budget;
import com.vhbeltramini.store.budget.BudgetItem;
import com.vhbeltramini.store.taxes.ICMS;
import com.vhbeltramini.store.taxes.ISS;
import com.vhbeltramini.store.taxes.TaxesCalculator;

import java.math.BigDecimal;

// This main class was created just to try the different design pattern used in this package, in this case was the chain of Strategy and Decorator pattern
public class MainTax {

    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("100")));
        budget.addItem(new BudgetItem(new BigDecimal("100")));
        TaxesCalculator calculator = new TaxesCalculator();
        System.out.println(calculator.calculate(budget, new ISS(new ICMS(null))));
        System.out.println(calculator.calculate(budget, new ISS(null)));
        System.out.println(calculator.calculate(budget, new ICMS(null)));
    }

}
