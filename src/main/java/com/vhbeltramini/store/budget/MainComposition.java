package com.vhbeltramini.store.budget;

import com.vhbeltramini.store.budget.Budget;
import com.vhbeltramini.store.budget.BudgetItem;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// This main class was created just to try the different design pattern used in this package, in this case was the Composite and Proxy Pattern
public class MainComposition {

    public static void main(String[] args) throws IOException, InterruptedException {
        Budget oldBudget = new Budget();
        oldBudget.addItem(new BudgetItem(new BigDecimal("100")));

        Budget newBudget = new Budget();
        newBudget.addItem(new BudgetItem(new BigDecimal("200")));
        newBudget.addItem(oldBudget);

        BudgetProxy proxy = new BudgetProxy(newBudget);

        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
    }

}
