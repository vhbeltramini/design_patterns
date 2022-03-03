package com.vhbeltramini.store.taxes;

import com.vhbeltramini.store.budget.Budget;
import com.vhbeltramini.store.taxes.ICMS;
import com.vhbeltramini.store.taxes.ISS;
import com.vhbeltramini.store.taxes.TaxesCalculator;

import java.math.BigDecimal;

// This main class was created just to try the different design pattern used in this package, in this case was the chain of Strategy pattern
public class MainTax {

    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxesCalculator calculator = new TaxesCalculator();
        System.out.println(calculator.calculate(budget, new ISS()));
        System.out.println(calculator.calculate(budget, new ICMS()));
    }

}
