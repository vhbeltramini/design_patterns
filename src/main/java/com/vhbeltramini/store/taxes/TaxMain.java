package com.vhbeltramini.store.taxes;

import com.vhbeltramini.store.budget.Budget;
import com.vhbeltramini.store.taxes.ICMS;
import com.vhbeltramini.store.taxes.ISS;
import com.vhbeltramini.store.taxes.TaxesCalculator;

import java.math.BigDecimal;

public class TaxMain {

    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxesCalculator calculator = new TaxesCalculator();
        System.out.println(calculator.calculate(budget, new ISS()));
        System.out.println(calculator.calculate(budget, new ICMS()));
    }

}
