package com.vhbeltramini.store.budget;

import com.vhbeltramini.store.DomainException;
import com.vhbeltramini.store.http.HttpAdapter;

import java.util.Map;

public class BudgetRegistration {

    private HttpAdapter httpAdapter;

    public BudgetRegistration(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void register(Budget budget) {
        if (!budget.isFinalized()) {
            throw new DomainException("Budget nof finished");
        }

        httpAdapter.post("https://github.com/vhbeltramini",
                Map.of("value", budget.getValue(), 
                       "quantityItens", budget.getItensQuantity()));


    }

}
