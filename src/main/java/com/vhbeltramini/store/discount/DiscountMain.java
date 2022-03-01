package com.vhbeltramini.store.discount;

import com.vhbeltramini.store.budget.Budget;

import java.math.BigDecimal;

/**
 * This main class was created just to try the different design pattern used in this package, in this case was the chain of responsibility pattern with the Pattern of Template Method as well
 */
public class DiscountMain {

    public static void main(String[] args) {
        Budget first = new Budget(new BigDecimal("200"), 6);

        Budget second = new Budget(new BigDecimal("1000"), 1);


        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(first));
        System.out.println(calculator.calculate(second));
    }

}
