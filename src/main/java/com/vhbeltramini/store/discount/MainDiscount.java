package com.vhbeltramini.store.discount;

import com.vhbeltramini.store.budget.Budget;
import com.vhbeltramini.store.budget.BudgetItem;

import java.math.BigDecimal;

/**
 * This main class was created just to try the different design pattern used in this package, in this case was the chain of responsibility pattern with the Pattern of Template Method as well
 */
public class MainDiscount {

    public static void main(String[] args) {
        BudgetItem budgetItem = new BudgetItem(new BigDecimal("100"));
        Budget first = new Budget();
        first.addItem(budgetItem);

        Budget second = new Budget();
        second.addItem(budgetItem);
        second.addItem(budgetItem);

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(first));
        System.out.println(calculator.calculate(second));
    }

}
