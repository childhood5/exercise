package com.company.exercise3;

import java.math.BigDecimal;

public class Bill {
    
    private User user;
    
    private Groceries groceries;
    
    private BigDecimal totalAmount;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Groceries getGroceries() {
        return groceries;
    }

    public void setGroceries(Groceries groceries) {
        this.groceries = groceries;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
