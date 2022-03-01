package com.vhbeltramini.store.discount;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget) {
        Discount discountChain = new DiscountForBudgetWithMoreThanFiveItens(
                new DiscountForBudgetWithValueGreaterThanFiveHundred(
                        new NoDiscount()));

        return discountChain.calculate(budget);
    }

}
