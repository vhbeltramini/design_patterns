package com.vhbeltramini.store.budget;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private Integer itensQuantity;

    public Budget(BigDecimal value) {
        this.value = value;
    }

    public Budget(BigDecimal value, Integer itensQuantity) {
        this.value = value;
        this.itensQuantity = itensQuantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Integer getItensQuantity() {
        return itensQuantity;
    }
}
