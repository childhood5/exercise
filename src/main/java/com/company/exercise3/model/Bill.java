package com.company.exercise3.model;

import java.math.BigDecimal;

public class Bill {
    
    private User user;
    
    private BigDecimal totalAmount;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
